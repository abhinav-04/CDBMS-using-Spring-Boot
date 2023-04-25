package com.prog.repository;

import com.prog.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
