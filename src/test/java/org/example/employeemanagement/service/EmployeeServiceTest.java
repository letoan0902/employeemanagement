package org.example.employeemanagement.service;

// ====================================================================
//  PHÂN CÔNG: Phạm Phương Anh
//  FILE: test/service/EmployeeServiceTest.java
//  MÔ TẢ: Unit Test cho EmployeeService (dùng Mockito)
// ====================================================================


import org.example.employeemanagement.exception.EmployeeNotFoundException;
import org.example.employeemanagement.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// 3. KHAI BÁO:
//    - @InjectMocks
//      private EmployeeService employeeService;
//    - (Tùy chọn) Tạo @BeforeEach để setup dữ liệu test
//
// 4. CÁC TEST CASE CẦN IMPLEMENT:
//
//    ┌─────┬──────────────────────────────────────┬─────────────────────────────────────┐
//    │ STT │ Tên test case                        │ Mô tả kỳ vọng                       │
//    ├─────┼──────────────────────────────────────┼─────────────────────────────────────┤
//    │  1  │ getAllEmployees_ReturnList             │ Trả về list KHÔNG rỗng khi có data │
//    │  2  │ getById_Found                         │ Trả về đúng Employee khi ID tồn tại│
//    │  3  │ getById_NotFound_ThrowException        │ Ném RuntimeException khi ID ko có  │
//    │  4  │ addEmployee_Success                    │ Thêm thành công, trả về employee   │
//    │  5  │ deleteEmployee_RemovesCorrectElement   │ Xóa đúng phần tử khi ID hợp lệ    │
//    └─────┴──────────────────────────────────────┴─────────────────────────────────────┘
//
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    private EmployeeService employeeService;
    private Employee employee1;
    private Employee employee2;

    @BeforeEach
    void setUp() {
        // Arrange - tạo mới service trước mỗi test để độc lập dữ liệu
        employeeService = new EmployeeService();

        employee1 = new Employee();
        employee1.setFullName("Nguyen Van A");
        employee1.setDepartment("IT");
        employee1.setSalary(15000000.0);

        employee2 = new Employee();
        employee2.setFullName("Tran Thi B");
        employee2.setDepartment("HR");
        employee2.setSalary(12000000.0);

        employee1 = employeeService.addEmployee(employee1);
        employee2 = employeeService.addEmployee(employee2);
    }

    @Test
    void getAllEmployees_ReturnList() {
        // Act
        List<Employee> result = employeeService.getAllEmployees();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(result.isEmpty());
    }

    @Test
    void getById_Found() {
        // Arrange
        Long id = employee1.getId();

        // Act
        Employee result = employeeService.getEmployeeById(id);

        // Assert
        assertNotNull(result);
        assertEquals(employee1.getId(), result.getId());
        assertEquals("Nguyen Van A", result.getFullName());
        assertEquals("IT", result.getDepartment());
        assertEquals(15000000.0, result.getSalary());
    }

    @Test
    void getById_NotFound_ThrowException() {
        // Arrange
        Long invalidId = 999L;

        // Act & Assert
        assertThrows(EmployeeNotFoundException.class, () -> employeeService.getEmployeeById(invalidId));
    }

    @Test
    void addEmployee_Success() {
        // Arrange
        Employee newEmployee = new Employee();
        newEmployee.setFullName("Le Van C");
        newEmployee.setDepartment("Finance");
        newEmployee.setSalary(18000000.0);

        int beforeSize = employeeService.getAllEmployees().size();

        // Act
        Employee result = employeeService.addEmployee(newEmployee);

        // Assert
        assertNotNull(result);
        assertNotNull(result.getId());
        assertEquals("Le Van C", result.getFullName());
        assertEquals("Finance", result.getDepartment());
        assertEquals(18000000.0, result.getSalary());
        assertEquals(beforeSize + 1, employeeService.getAllEmployees().size());
    }

    @Test
    void deleteEmployee_RemovesCorrectElement() {
        // Arrange
        Long idToDelete = employee1.getId();
        int beforeSize = employeeService.getAllEmployees().size();

        // Act
        employeeService.deleteEmployee(idToDelete);

        // Assert
        assertEquals(beforeSize - 1, employeeService.getAllEmployees().size());
        assertThrows(EmployeeNotFoundException.class, () -> employeeService.getEmployeeById(idToDelete));
    }
}