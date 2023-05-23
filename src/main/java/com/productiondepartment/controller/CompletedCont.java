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
@RequestMapping("/completed")
public class CompletedCont extends Attributes {
    @GetMapping
    public String assembling(Model model) {
        AddAttributesCompleted(model);
        return "completed";
    }
}
