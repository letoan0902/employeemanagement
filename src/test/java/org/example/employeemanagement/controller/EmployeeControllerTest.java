package org.example.employeemanagement.controller;

// ====================================================================
//  PHÂN CÔNG: Phạm Phương Anh
//  FILE: test/controller/EmployeeControllerTest.java
//  MÔ TẢ: Integration Test cho EmployeeController (dùng WebMvcTest)
// ====================================================================

import org.example.employeemanagement.exception.EmployeeNotFoundException;
import org.example.employeemanagement.model.Employee;
import org.example.employeemanagement.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.get;
import static jdk.jfr.internal.jfc.model.Constraint.any;
import static org.mockito.Mockito.when;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    private Employee createEmployee(Long id, String fullName, String department, Double salary) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFullName(fullName);
        employee.setDepartment(department);
        employee.setSalary(salary);
        return employee;
    }

    @Test
    void getAllEmployees_Returns200() throws Exception {
        // Arrange
        List<Employee> employees = Arrays.asList(
                createEmployee(1L, "Nguyen Van A", "IT", 15000000.0),
                createEmployee(2L, "Tran Thi B", "HR", 12000000.0)
        );
        when(employeeService.getAllEmployees()).thenReturn(employees);

        // Act & Assert
        mockMvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].fullName").value("Nguyen Van A"))
                .andExpect(jsonPath("$[1].fullName").value("Tran Thi B"));
    }

    @Test
    void getEmployeeById_Found_Returns200() throws Exception {
        // Arrange
        Employee employee = createEmployee(1L, "Nguyen Van A", "IT", 15000000.0);
        when(employeeService.getEmployeeById(1L)).thenReturn(employee);

        // Act & Assert
        mockMvc.perform(get("/api/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.fullName").value("Nguyen Van A"))
                .andExpect(jsonPath("$.department").value("IT"))
                .andExpect(jsonPath("$.salary").value(15000000.0));
    }

    @Test
    void getEmployeeById_NotFound_Returns404() throws Exception {
        // Arrange
        when(employeeService.getEmployeeById(999L))
                .thenThrow(new EmployeeNotFoundException(999L));

        // Act & Assert
        mockMvc.perform(get("/api/employees/999"))
                .andExpect(status().isNotFound());
    }

    @Test
    void addEmployee_Returns201() throws Exception {
        // Arrange
        Employee createdEmployee = createEmployee(3L, "Nguyen Van C", "Engineering", 15000000.0);
        when(employeeService.addEmployee(any(Employee.class))).thenReturn(createdEmployee);

        String requestBody = """
                {
                    "fullName": "Nguyen Van C",
                    "department": "Engineering",
                    "salary": 15000000
                }
                """;

        // Act & Assert
        mockMvc.perform(post("/api/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(3))
                .andExpect(jsonPath("$.fullName").value("Nguyen Van C"))
                .andExpect(jsonPath("$.department").value("Engineering"))
                .andExpect(jsonPath("$.salary").value(15000000.0));
    }
}