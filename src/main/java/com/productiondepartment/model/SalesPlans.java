package com.productiondepartment.model;

import com.productiondepartment.model.enums.SalesPlansStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class SalesPlans {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private int quantity;
    private String time;
    private String deadline;
    private SalesPlansStatus status;

    public SalesPlans(String name, int quantity, String time, String deadline) {
        this.name = name;
        this.quantity = quantity;
        this.time = time;
        this.deadline = deadline;
        this.status = SalesPlansStatus.GENERATED;
    }
}
