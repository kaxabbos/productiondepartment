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
@RequestMapping("/assembling")
public class AssemblingCont extends Attributes {
    @GetMapping
    public String assembling(Model model) {
        AddAttributesAssembling(model);
        return "assembling";
    }

    @GetMapping("/{id}/assembling")
    public String SalesAssembling(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.ASSEMBLING);
        salesPlansRepo.save(salesPlans);
        return "redirect:/assembling";
    }

    @GetMapping("/{id}/the_build_is_complete")
    public String Sales_the_build_is_complete(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.THE_BUILD_IS_COMPLETE);
        salesPlansRepo.save(salesPlans);
        return "redirect:/assembling";
    }

}
