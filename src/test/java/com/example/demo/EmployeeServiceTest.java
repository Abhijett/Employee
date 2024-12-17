package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import com.example.demo.entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindEmployeeById() {
        Employee employee = new Employee("John Doe", "Engineering", 60000);
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        Employee found = employeeService.getEmployeeById(1L).orElse(null);
        assertEquals("John Doe", found.getName());
    }
}