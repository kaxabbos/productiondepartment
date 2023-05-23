package com.productiondepartment.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeOfRawMaterial {
    WOOD("Дерево"),
    PLASTIC("Пластик"),
    PAINT("Краска"),
    METAL("Метал"),
    IRON("Железо");

    private final String name;
}
