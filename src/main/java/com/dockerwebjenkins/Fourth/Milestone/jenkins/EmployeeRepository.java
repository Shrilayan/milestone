package com.dockerwebjenkins.Fourth.Milestone.jenkins;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    public Employee getEmployeeByEmailId(String email_id);

}