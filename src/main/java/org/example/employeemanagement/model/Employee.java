package org.example.employeemanagement.model;

// ====================================================================
// 📋 PHÂN CÔNG: Trần Đăng Việt
// 📁 FILE: model/Employee.java
// 📝 MÔ TẢ: Entity Employee - Đối tượng nhân viên
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. IMPORT CẦN THIẾT:
//    - com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
//    - java.util.concurrent.atomic.AtomicLong
//
// 2. ANNOTATION TRÊN CLASS:
//    - @JacksonXmlRootElement(localName = "employee")
//      → Cho phép response trả về định dạng XML ngoài JSON
//
// 3. THUỘC TÍNH (FIELDS):
//    ┌──────────────┬──────────┬────────────────────────────────────┐
//    │ Tên          │ Kiểu    │ Mô tả                              │
//    ├──────────────┼──────────┼────────────────────────────────────┤
//    │ id           │ Long     │ Mã nhân viên (tự tăng từ 1)       │
//    │ fullName     │ String   │ Họ và tên (NOT NULL)               │
//    │ department   │ String   │ Phòng ban (NOT NULL)               │
//    │ salary       │ Double   │ Mức lương VNĐ (phải > 0)          │
//    └──────────────┴──────────┴────────────────────────────────────┘
//
// 4. ID TỰ ĐỘNG TĂNG:
//    - Khai báo biến static: private static final AtomicLong counter = new AtomicLong(1);
//    - Trong constructor đầy đủ tham số (KHÔNG có id):
//      this.id = counter.getAndIncrement();
//
// 5. CONSTRUCTORS:
//    a) Constructor không tham số (default constructor)
//    b) Constructor đầy đủ: Employee(String fullName, String department, Double salary)
//       → Gán id tự động bằng counter.getAndIncrement()
//
// 6. GETTER / SETTER:
//    - Tạo getter và setter cho TẤT CẢ thuộc tính (id, fullName, department, salary)
//
// 7. (TÙY CHỌN) Override toString():
//    - Trả về chuỗi mô tả Employee, ví dụ:
//      "Employee{id=1, fullName='Nguyen Van A', department='Engineering', salary=15000000.0}"
//    - Phục vụ cho AOP logging (AfterReturning sẽ log result.toString())
//
// ====================================================================
// 💡 GỢI Ý VALIDATION (annotation trên field):
//    - @NotNull hoặc @NotBlank cho fullName, department
//    - @Min(1) hoặc @Positive cho salary
//    - Import từ: jakarta.validation.constraints.*
// ====================================================================

public class Employee {

    // TODO: Viết code tại đây

}
