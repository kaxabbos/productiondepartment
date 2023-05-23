package com.productiondepartment.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SpecificationsStatus {
    WAITING("Ожидание"),
    DELIVERED("Доставлено"),
    ;

    private final String name;
}
