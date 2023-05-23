package com.productiondepartment.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Routes {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private int operationNumber;
    private String name;
    private String time;

    public Routes(int operationNumber, String name, String time) {
        this.operationNumber = operationNumber;
        this.name = name;
        this.time = time;
    }
}
