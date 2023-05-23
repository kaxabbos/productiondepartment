package com.productiondepartment.controller;

import com.productiondepartment.controller.main.Attributes;
import com.productiondepartment.model.SalesPlans;
import com.productiondepartment.model.enums.SalesPlansStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sales")
public class SalesCont extends Attributes {
    @GetMapping
    public String Sales(Model model) {
        AddAttributesSales(model);
        return "sales";
    }

    @PostMapping("/add")
    public String SalesAdd(@RequestParam String name, @RequestParam int quantity, @RequestParam String time, @RequestParam String deadline) {
        salesPlansRepo.save(new SalesPlans(name, quantity, time, deadline));
        return "redirect:/sales";
    }

    @GetMapping("/{id}/planned")
    public String SalesPlanned(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.PLANNED);
        salesPlansRepo.save(salesPlans);
        return "redirect:/sales";
    }

    @GetMapping("/{id}/next")
    public String SalesNext(@PathVariable Long id) {
        SalesPlans salesPlans = salesPlansRepo.getReferenceById(id);
        salesPlans.setStatus(SalesPlansStatus.NEXT_PERIOD);
        salesPlansRepo.save(salesPlans);
        return "redirect:/sales";
    }
}
