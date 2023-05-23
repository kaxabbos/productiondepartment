package com.productiondepartment.controller;

import com.productiondepartment.controller.main.Attributes;
import com.productiondepartment.model.SalesPlans;
import com.productiondepartment.model.enums.SalesPlansStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paint")
public class PaintCont extends Attributes {
    @GetMapping
    public String paint(Model model) {
        AddAttributesPaint(model);
        return "paint";
    }

    @GetMapping("/{id}/painting")
    public String SalesAssembling(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.PAINTING);
        salesPlansRepo.save(salesPlans);
        return "redirect:/paint";
    }

    @GetMapping("/{id}/painting_is_completed")
    public String Sales_painting_is_completed(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.PAINTING_IS_COMPLETED);
        salesPlansRepo.save(salesPlans);
        return "redirect:/paint";
    }

}
