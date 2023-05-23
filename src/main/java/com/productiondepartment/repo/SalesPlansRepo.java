package com.productiondepartment.repo;

import com.productiondepartment.model.SalesPlans;
import com.productiondepartment.model.enums.SalesPlansStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesPlansRepo extends JpaRepository<SalesPlans, Long> {
    List<SalesPlans> findAllByStatus(SalesPlansStatus status);
}
