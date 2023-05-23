package com.productiondepartment.repo;

import com.productiondepartment.model.Specifications;
import com.productiondepartment.model.enums.SpecificationsStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecificationsRepo extends JpaRepository<Specifications, Long> {
    List<Specifications> findAllByStatus(SpecificationsStatus status);
}
