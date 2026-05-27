package org.example.employeemanagement.controller;

// ====================================================================
// 📋 PHÂN CÔNG: Lê Tiến Đức
// 📁 FILE: controller/EmployeeController.java
// 📝 MÔ TẢ: REST Controller - Xử lý HTTP Request cho Employee API
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. ANNOTATION TRÊN CLASS:
//    - @RestController → Đánh dấu đây là REST Controller (trả về JSON/XML)
//    - @RequestMapping("/api/employees") → Base URL cho tất cả endpoints
//
// 2. IMPORT CẦN THIẾT:
//    - org.springframework.web.bind.annotation.*
//    - org.springframework.http.ResponseEntity
//    - org.springframework.http.HttpStatus
//    - org.slf4j.Logger
//    - org.slf4j.LoggerFactory
//    - org.example.employeemanagement.model.Employee
//    - org.example.employeemanagement.service.EmployeeService
//    - org.example.employeemanagement.exception.EmployeeNotFoundException
//    - jakarta.validation.Valid (nếu dùng validation)
//    - java.util.List
//
// 3. DEPENDENCY INJECTION:
//    - Inject EmployeeService qua constructor:
//      private final EmployeeService employeeService;
//      public EmployeeController(EmployeeService employeeService) { ... }
//
// 4. KHAI BÁO LOGGER (SLF4J):
//    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
//
// 5. CÁC ENDPOINT CẦN IMPLEMENT:
//
//    ┌────────┬───────────────────────┬──────────────────┬──────────────┐
//    │ Method │ Endpoint              │ Status OK        │ Status Error │
//    ├────────┼───────────────────────┼──────────────────┼──────────────┤
//    │ GET    │ /api/employees        │ 200 OK           │ —            │
//    │ GET    │ /api/employees/{id}   │ 200 OK           │ 404 Not Found│
//    │ POST   │ /api/employees        │ 201 Created      │ 400 Bad Req  │
//    │ PUT    │ /api/employees/{id}   │ 200 OK           │ 404 Not Found│
//    │ DELETE │ /api/employees/{id}   │ 204 No Content   │ 404 Not Found│
//    └────────┴───────────────────────┴──────────────────┴──────────────┘
//
//    a) @GetMapping
//       getAllEmployees()
//       - Trả về: ResponseEntity<List<Employee>>
//       - Status: 200 OK
//       - Log: logger.info("GET /api/employees called");
//
//    b) @GetMapping("/{id}")
//       getEmployeeById(@PathVariable Long id)
//       - Trả về: ResponseEntity<Employee>
//       - Thành công: 200 OK
//       - Thất bại: 404 Not Found (catch EmployeeNotFoundException)
//       - Log: logger.info("GET /api/employees/{} called", id);
//
//    c) @PostMapping
//       addEmployee(@RequestBody Employee employee)
//       - Trả về: ResponseEntity<Employee>
//       - Status: 201 Created
//       - Dùng: ResponseEntity.status(HttpStatus.CREATED).body(...)
//       - Log: logger.info("POST /api/employees called");
//
//    d) @PutMapping("/{id}")
//       updateEmployee(@PathVariable Long id, @RequestBody Employee employee)
//       - Trả về: ResponseEntity<Employee>
//       - Thành công: 200 OK
//       - Thất bại: 404 Not Found
//       - Log: logger.info("PUT /api/employees/{} called", id);
//
//    e) @DeleteMapping("/{id}")
//       deleteEmployee(@PathVariable Long id)
//       - Trả về: ResponseEntity<Void>
//       - Thành công: 204 No Content → ResponseEntity.noContent().build()
//       - Thất bại: 404 Not Found
//       - Log: logger.info("DELETE /api/employees/{} called", id);
//
// 6. XỬ LÝ EXCEPTION:
//    - Sử dụng try-catch cho EmployeeNotFoundException
//    - Khi catch: return ResponseEntity.notFound().build();
//    - Log WARN: logger.warn("Employee not found with id: {}", id);
//
// ====================================================================
// 💡 VÍ DỤ MẪU CHO 1 ENDPOINT:
//
//    @GetMapping
//    public ResponseEntity<List<Employee>> getAllEmployees() {
//        logger.info("GET /api/employees called");
//        List<Employee> list = employeeService.getAllEmployees();
//        return ResponseEntity.ok(list);
//    }
// ====================================================================

public class EmployeeController {

    // TODO: Viết code tại đây

}
