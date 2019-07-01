package com.auxo.ragu.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.auxo.ragu.model.Employee;
//import org.springframework.stereotype.Repository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
