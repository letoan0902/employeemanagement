package org.example.employeemanagement.service;

// ====================================================================
// 📋 PHÂN CÔNG: Phạm Phương Anh
// 📁 FILE: test/service/EmployeeServiceTest.java
// 📝 MÔ TẢ: Unit Test cho EmployeeService (dùng Mockito)
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. ANNOTATION TRÊN CLASS:
//    - @ExtendWith(MockitoExtension.class)
//      → Kích hoạt Mockito trong JUnit 5
//
// 2. IMPORT CẦN THIẾT:
//    - org.junit.jupiter.api.Test
//    - org.junit.jupiter.api.BeforeEach
//    - org.junit.jupiter.api.extension.ExtendWith
//    - org.mockito.junit.jupiter.MockitoExtension
//    - org.mockito.InjectMocks
//    - org.mockito.Mock (nếu cần)
//    - static org.junit.jupiter.api.Assertions.*
//    - static org.mockito.Mockito.*
//    - org.example.employeemanagement.model.Employee
//    - org.example.employeemanagement.service.EmployeeService
//    - org.example.employeemanagement.exception.EmployeeNotFoundException
//    - java.util.List
//
// 3. KHAI BÁO:
//    - @InjectMocks
//      private EmployeeService employeeService;
//    - (Tùy chọn) Tạo @BeforeEach để setup dữ liệu test
//
// 4. CÁC TEST CASE CẦN IMPLEMENT:
//
//    ┌─────┬──────────────────────────────────────┬─────────────────────────────────────┐
//    │ STT │ Tên test case                         │ Mô tả kỳ vọng                      │
//    ├─────┼──────────────────────────────────────┼─────────────────────────────────────┤
//    │  1  │ getAllEmployees_ReturnList             │ Trả về list KHÔNG rỗng khi có data │
//    │  2  │ getById_Found                         │ Trả về đúng Employee khi ID tồn tại│
//    │  3  │ getById_NotFound_ThrowException        │ Ném RuntimeException khi ID ko có  │
//    │  4  │ addEmployee_Success                    │ Thêm thành công, trả về employee   │
//    │  5  │ deleteEmployee_RemovesCorrectElement   │ Xóa đúng phần tử khi ID hợp lệ    │
//    └─────┴──────────────────────────────────────┴─────────────────────────────────────┘
//
//    ─────────────────────────────────────────────────────────────
//    TEST 1: getAllEmployees_ReturnList
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void getAllEmployees_ReturnList() {
//        // Arrange: Thêm employee vào service
//        // Act: Gọi getAllEmployees()
//        // Assert: assertFalse(result.isEmpty())
//        //         assertTrue(result.size() > 0)
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 2: getById_Found
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void getById_Found() {
//        // Arrange: Thêm employee, lấy id
//        // Act: Gọi getEmployeeById(id)
//        // Assert: assertNotNull(result)
//        //         assertEquals(expectedName, result.getFullName())
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 3: getById_NotFound_ThrowException
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void getById_NotFound_ThrowException() {
//        // Arrange: Dùng ID không tồn tại (VD: 999L)
//        // Act & Assert:
//        //   assertThrows(EmployeeNotFoundException.class, () -> {
//        //       employeeService.getEmployeeById(999L);
//        //   });
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 4: addEmployee_Success
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void addEmployee_Success() {
//        // Arrange: Tạo Employee mới
//        // Act: Gọi addEmployee(employee)
//        // Assert: assertNotNull(result)
//        //         assertNotNull(result.getId())
//        //         assertEquals(expectedName, result.getFullName())
//    }
//
//    ─────────────────────────────────────────────────────────────
//    TEST 5: deleteEmployee_RemovesCorrectElement
//    ─────────────────────────────────────────────────────────────
//    @Test
//    void deleteEmployee_RemovesCorrectElement() {
//        // Arrange: Thêm employee, lấy id
//        // Act: Gọi deleteEmployee(id)
//        // Assert: Kiểm tra list không còn employee đó
//        //   assertThrows(EmployeeNotFoundException.class, () -> {
//        //       employeeService.getEmployeeById(id);
//        //   });
//    }
//
// ====================================================================
// 💡 LƯU Ý:
//    - EmployeeService dùng ArrayList in-memory → không cần Mock repository
//    - Có thể dùng @InjectMocks trực tiếp hoặc new EmployeeService()
//    - Mỗi test nên có đầy đủ: Arrange → Act → Assert
//    - Dùng @BeforeEach để thêm dữ liệu mẫu trước mỗi test
// ====================================================================

public class EmployeeServiceTest {

    // TODO: Viết code tại đây

}
