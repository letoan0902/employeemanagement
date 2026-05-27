package org.example.employeemanagement.exception;

// ====================================================================
// 📋 PHÂN CÔNG: Trần Đăng Việt
// 📁 FILE: exception/EmployeeNotFoundException.java
// 📝 MÔ TẢ: Custom Exception khi không tìm thấy nhân viên theo ID
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. CLASS DEFINITION:
//    - Kế thừa (extends) RuntimeException
//    - Đây là Unchecked Exception, không bắt buộc try-catch
//
// 2. CONSTRUCTOR:
//    - Nhận tham số Long id
//    - Gọi super() với message mô tả lỗi, ví dụ:
//      super("Employee not found with id: " + id)
//
// 3. SỬ DỤNG:
//    - Service sẽ throw exception này khi tìm nhân viên theo ID mà không có
//    - Controller sẽ catch exception này và trả về HTTP 404 Not Found
//
// ====================================================================
// 💡 VÍ DỤ SỬ DỤNG TRONG SERVICE:
//    throw new EmployeeNotFoundException(id);
//
// 💡 VÍ DỤ SỬ DỤNG TRONG CONTROLLER:
//    try {
//        Employee emp = service.getEmployeeById(id);
//        return ResponseEntity.ok(emp);
//    } catch (EmployeeNotFoundException e) {
//        return ResponseEntity.notFound().build();
//    }
// ====================================================================

public class EmployeeNotFoundException {

    // TODO: Viết code tại đây

}
