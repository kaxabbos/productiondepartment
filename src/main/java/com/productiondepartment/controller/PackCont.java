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
@RequestMapping("/pack")
public class PackCont extends Attributes {
    @GetMapping
    public String pack(Model model) {
        AddAttributesPack(model);
        return "pack";
    }

    @GetMapping("/{id}/packaging")
    public String SalesPackaging(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.PACKAGING);
        salesPlansRepo.save(salesPlans);
        return "redirect:/pack";
    }

    @GetMapping("/{id}/completed")
    public String SalesCompleted(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.COMPLETED);
        salesPlansRepo.save(salesPlans);
        return "redirect:/pack";
    }

}
