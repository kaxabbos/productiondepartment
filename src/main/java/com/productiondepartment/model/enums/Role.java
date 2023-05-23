package com.productiondepartment.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Role implements GrantedAuthority {
    ADMIN("Администратор"),
    TECHNOLOGIST("Технолог"),
    DISPATCHER("Диспетчер"),
    ASSEMBLY_SHOP_FOREMAN("Мастер сборочного цеха"),
    MASTER_OF_THE_PAINT_SHOP("Мастер покрасочного цеха"),
    MASTER_OF_THE_PACKAGING_SHOP("Мастер упаковочного цеха"),
    EMPLOYEE("Сотрудник");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}

