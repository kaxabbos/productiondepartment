package com.productiondepartment.controller.main;

import com.productiondepartment.model.Specifications;
import com.productiondepartment.model.enums.*;
import com.productiondepartment.repo.SpecificationsRepo;
import org.springframework.ui.Model;

public class Attributes extends Main {

    protected void AddAttributes(Model model) {
        model.addAttribute("role", getRole());
        model.addAttribute("user", getUser());
    }

    protected void AddAttributesEnums(Model model) {
        model.addAttribute("roles", Role.values());
        model.addAttribute("typeOfRawMaterials", TypeOfRawMaterial.values());
        model.addAttribute("unitOfMeasurements", UnitOfMeasurement.values());
    }

    protected void AddAttributesIndex(Model model) {
        AddAttributes(model);
    }


    protected void AddAttributesSales(Model model) {
        AddAttributes(model);
        model.addAttribute("sales", salesPlansRepo.findAll());
    }

    protected void AddAttributesAssembling(Model model) {
        AddAttributes(model);
        model.addAttribute("salesPlanned", salesPlansRepo.findAllByStatus(SalesPlansStatus.PLANNED));
        model.addAttribute("salesAssembling", salesPlansRepo.findAllByStatus(SalesPlansStatus.ASSEMBLING));
    }

    protected void AddAttributesPaint(Model model) {
        AddAttributes(model);
        model.addAttribute("salesThe_build_is_complete", salesPlansRepo.findAllByStatus(SalesPlansStatus.THE_BUILD_IS_COMPLETE));
        model.addAttribute("salesPainting", salesPlansRepo.findAllByStatus(SalesPlansStatus.PAINTING));
    }

    protected void AddAttributesPack(Model model) {
        AddAttributes(model);
        model.addAttribute("salesPainting_is_completed", salesPlansRepo.findAllByStatus(SalesPlansStatus.PAINTING_IS_COMPLETED));
        model.addAttribute("salesPackaging", salesPlansRepo.findAllByStatus(SalesPlansStatus.PACKAGING));
    }

    protected void AddAttributesCompleted(Model model) {
        AddAttributes(model);
        model.addAttribute("sales", salesPlansRepo.findAllByStatus(SalesPlansStatus.COMPLETED));
    }

    protected void AddAttributesOrdering(Model model) {
        AddAttributes(model);
        model.addAttribute("typeOfRawMaterials", TypeOfRawMaterial.values());
        model.addAttribute("unitOfMeasurements", UnitOfMeasurement.values());
        model.addAttribute("orderings", specificationsRepo.findAll());
    }

    protected void AddAttributesProfiles(Model model) {
        AddAttributes(model);
        AddAttributesEnums(model);
        model.addAttribute("users", usersRepo.findAllByOrderByRole());
    }

    protected void AddAttributesAddUser(Model model) {
        AddAttributes(model);
        AddAttributesEnums(model);
    }
}
