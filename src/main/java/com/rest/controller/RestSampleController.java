package com.rest.controller;

import com.rest.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/internal/employee")
public class RestSampleController {

    //todo check how data is exposed in url
    @GetMapping("/employee")
    public Employee hello(String caller) {
        Employee employee = new Employee("Hey there");
        employee.setEmail("test@test.com");
        employee.setDepartment(caller);
        return employee;
    }

}