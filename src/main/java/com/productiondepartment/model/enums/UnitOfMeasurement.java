package com.productiondepartment.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UnitOfMeasurement {
    L("Литр"),
    ML("Миллилитр"),
    G("Грамм"),
    KG("Килограмм");

    private final String name;
}
