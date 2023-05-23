package com.productiondepartment.controller;

import com.productiondepartment.controller.main.Attributes;
import com.productiondepartment.model.Specifications;
import com.productiondepartment.model.enums.SpecificationsStatus;
import com.productiondepartment.model.enums.TypeOfRawMaterial;
import com.productiondepartment.model.enums.UnitOfMeasurement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ordering")
public class OrderingCont extends Attributes {
    @GetMapping
    public String Ordering(Model model) {
        AddAttributesOrdering(model);
        return "ordering";
    }

    @PostMapping("/add")
    public String OrderingAdd(@RequestParam String article, @RequestParam String name, @RequestParam TypeOfRawMaterial typeOfRawMaterial, @RequestParam UnitOfMeasurement unitOfMeasurement, @RequestParam int quantity) {
        specificationsRepo.save(new Specifications(article, name, typeOfRawMaterial, unitOfMeasurement, quantity));
        return "redirect:/ordering";
    }

    @GetMapping("/{id}/delivered")
    public String OrderingDelivered(@PathVariable Long id) {
        Specifications specifications = specificationsRepo.getReferenceById(id);
        specifications.setStatus(SpecificationsStatus.DELIVERED);
        specificationsRepo.save(specifications);
        return "redirect:/ordering";
    }
}
