package com.productiondepartment.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SalesPlansStatus {
    GENERATED("Создан"),
    NEXT_PERIOD("Следующий период"),
    PLANNED("Запланировано"),
    ASSEMBLING("Сборка"),
    THE_BUILD_IS_COMPLETE("Сборка завершена"),
    PAINTING("Покраска"),
    PAINTING_IS_COMPLETED("Покраска завершена"),
    PACKAGING("Упаковка"),
    COMPLETED("Завершено"),
    ;

    private final String name;
}
