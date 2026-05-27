package org.example.employeemanagement.service;

// ====================================================================
// 📋 PHÂN CÔNG: Lê Duy Minh
// 📁 FILE: service/EmployeeService.java
// 📝 MÔ TẢ: Service Layer - Xử lý nghiệp vụ quản lý nhân viên
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. ANNOTATION TRÊN CLASS:
//    - @Service → Đánh dấu đây là Spring Service Bean
//
// 2. IMPORT CẦN THIẾT:
//    - org.springframework.stereotype.Service
//    - org.slf4j.Logger
//    - org.slf4j.LoggerFactory
//    - org.example.employeemanagement.model.Employee
//    - org.example.employeemanagement.exception.EmployeeNotFoundException
//    - java.util.ArrayList
//    - java.util.List
//    - java.util.Optional
//
// 3. KHAI BÁO LOGGER (SLF4J):
//    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
//
// 4. DỮ LIỆU LƯU TRỮ IN-MEMORY:
//    - Khai báo: private final List<Employee> employees = new ArrayList<>();
//    - KHÔNG sử dụng database, tất cả dữ liệu lưu trong ArrayList
//    - (Tùy chọn) Thêm dữ liệu mẫu trong constructor hoặc @PostConstruct
//
// 5. CÁC METHOD CẦN IMPLEMENT:
//
//    a) getAllEmployees()
//       - Trả về: List<Employee>
//       - Hành vi: Trả về toàn bộ danh sách employees
//
//    b) getEmployeeById(Long id)
//       - Trả về: Employee
//       - Hành vi: Tìm employee theo id trong list
//       - Nếu KHÔNG tìm thấy → throw EmployeeNotFoundException(id)
//       - Log WARN: "Employee not found with id: {}"
//
//    c) addEmployee(Employee employee)
//       - Trả về: Employee
//       - Hành vi: Thêm employee vào list và trả về employee đã thêm
//       - ID được tự động sinh trong constructor của Employee
//
//    d) updateEmployee(Long id, Employee updatedEmployee)
//       - Trả về: Employee
//       - Hành vi: Tìm employee theo id, cập nhật fullName, department, salary
//       - Nếu KHÔNG tìm thấy → throw EmployeeNotFoundException(id)
//
//    e) deleteEmployee(Long id)
//       - Trả về: void
//       - Hành vi: Tìm employee theo id và xóa khỏi list
//       - Nếu KHÔNG tìm thấy → throw EmployeeNotFoundException(id)
//
// 6. YÊU CẦU LOGGING (SLF4J):
//    - Log INFO khi thực hiện thao tác thành công
//      VD: logger.info("Added new employee: {}", employee.getFullName());
//    - Log WARN khi không tìm thấy nhân viên
//      VD: logger.warn("Employee not found with id: {}", id);
//    - Log ERROR trong khối catch Exception (nếu có)
//      VD: logger.error("Error processing employee: {}", e.getMessage());
//
// ====================================================================
// 💡 LƯU Ý:
//    - Dữ liệu sẽ mất khi restart server (vì lưu in-memory)
//    - Có thể thêm 2-3 employee mẫu để dễ test
//    - toString() của Employee sẽ được AOP log (@AfterReturning)
// ====================================================================

public class EmployeeService {

    // TODO: Viết code tại đây

}
