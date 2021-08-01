package net.javaguides.Springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.Springbootbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
