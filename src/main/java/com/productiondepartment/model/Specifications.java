package com.productiondepartment.model;

import com.productiondepartment.model.enums.SpecificationsStatus;
import com.productiondepartment.model.enums.TypeOfRawMaterial;
import com.productiondepartment.model.enums.UnitOfMeasurement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Specifications {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String article;
    private String name;
    @Enumerated(EnumType.STRING)
    private TypeOfRawMaterial typeOfRawMaterial;
    @Enumerated(EnumType.STRING)
    private UnitOfMeasurement unitOfMeasurement;
    private int quantity;
    @Enumerated(EnumType.STRING)
    private SpecificationsStatus status;

    public Specifications(String article, String name, TypeOfRawMaterial typeOfRawMaterial, UnitOfMeasurement unitOfMeasurement, int quantity) {
        this.article = article;
        this.name = name;
        this.typeOfRawMaterial = typeOfRawMaterial;
        this.unitOfMeasurement = unitOfMeasurement;
        this.quantity = quantity;
        this.status = SpecificationsStatus.WAITING;
    }
}
