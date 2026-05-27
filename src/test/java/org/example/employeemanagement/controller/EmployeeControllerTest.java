package org.example.employeemanagement.controller;

// ====================================================================
// 📋 PHÂN CÔNG: Phạm Phương Anh
// 📁 FILE: test/controller/EmployeeControllerTest.java
// 📝 MÔ TẢ: Integration Test cho EmployeeController (dùng WebMvcTest)
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. ANNOTATION TRÊN CLASS:
//    - @WebMvcTest(EmployeeController.class)
//      → Chỉ load Controller layer, không load toàn bộ Spring Context
//
// 2. IMPORT CẦN THIẾT:
//    - org.junit.jupiter.api.Test
//    - org.springframework.beans.factory.annotation.Autowired
//    - org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
//    - org.springframework.test.web.servlet.MockMvc
//    - org.springframework.boot.test.mock.mockito.MockBean
//    - org.springframework.http.MediaType
//    - static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
//    - static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
//    - static org.mockito.Mockito.*
//    - static org.mockito.ArgumentMatchers.*
//    - org.example.employeemanagement.model.Employee
//    - org.example.employeemanagement.service.EmployeeService
//    - org.example.employeemanagement.exception.EmployeeNotFoundException
//    - java.util.Arrays
//    - java.util.List
//
// 3. KHAI BÁO:
//    @Autowired
//    private MockMvc mockMvc;      → Để gửi HTTP request giả lập
//
//    @MockBean
//    private EmployeeService employeeService;  → Mock Service layer
//
// 4. CÁC TEST CASE CẦN IMPLEMENT:
//
//    ─────────────────────────────────────────────────────────────
//    TEST 1: GET /api/employees → HTTP 200 + danh sách JSON
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void getAllEmployees_Returns200() throws Exception {
//        // Arrange: Mock service trả về list
//        //   List<Employee> list = Arrays.asList(...);
//        //   when(employeeService.getAllEmployees()).thenReturn(list);
//        //
//        // Act & Assert:
//        //   mockMvc.perform(get("/api/employees"))
//        //       .andExpect(status().isOk())
//        //       .andExpect(jsonPath("$").isArray())
//        //       .andExpect(jsonPath("$.length()").value(expectedSize));
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 2: GET /api/employees/{id} → HTTP 200 khi tìm thấy
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void getEmployeeById_Found_Returns200() throws Exception {
//        // Arrange: Mock service trả về employee
//        //   Employee emp = new Employee("Nguyen Van A", "IT", 15000000.0);
//        //   when(employeeService.getEmployeeById(1L)).thenReturn(emp);
//        //
//        // Act & Assert:
//        //   mockMvc.perform(get("/api/employees/1"))
//        //       .andExpect(status().isOk())
//        //       .andExpect(jsonPath("$.fullName").value("Nguyen Van A"));
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 3: GET /api/employees/{id} → HTTP 404 khi không tìm thấy
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void getEmployeeById_NotFound_Returns404() throws Exception {
//        // Arrange: Mock service ném exception
//        //   when(employeeService.getEmployeeById(999L))
//        //       .thenThrow(new EmployeeNotFoundException(999L));
//        //
//        // Act & Assert:
//        //   mockMvc.perform(get("/api/employees/999"))
//        //       .andExpect(status().isNotFound());
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 4: POST /api/employees → HTTP 201 sau khi tạo thành công
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void addEmployee_Returns201() throws Exception {
//        // Arrange: Mock service trả về employee đã tạo
//        //   Employee emp = new Employee("Nguyen Van A", "IT", 15000000.0);
//        //   when(employeeService.addEmployee(any(Employee.class))).thenReturn(emp);
//        //
//        // Act & Assert:
//        //   String requestBody = """
//        //       {
//        //           "fullName": "Nguyen Van A",
//        //           "department": "IT",
//        //           "salary": 15000000
//        //       }
//        //       """;
//        //   mockMvc.perform(post("/api/employees")
//        //           .contentType(MediaType.APPLICATION_JSON)
//        //           .content(requestBody))
//        //       .andExpect(status().isCreated())
//        //       .andExpect(jsonPath("$.fullName").value("Nguyen Van A"));
//    }
//
// ====================================================================
// 💡 LƯU Ý:
//    - @WebMvcTest chỉ load Controller → Service phải dùng @MockBean
//    - MockMvc.perform() để gửi request, sau đó .andExpect() để assert
//    - jsonPath("$.field") dùng JSONPath để kiểm tra response body
//    - Cần test cả trường hợp thành công VÀ thất bại
//    - Kiểm tra đúng HTTP Status Code cho mỗi test case
// ====================================================================

public class EmployeeControllerTest {

    // TODO: Viết code tại đây

}
