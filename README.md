# 📦 Employee Management - RESTful API (Mini Project)

> **Môn học:** Java Web Service  
> **Công nghệ:** Java 17+, Spring Boot 3.x, Spring AOP, SLF4J, JUnit 5, Mockito

---

## 📝 Mô tả dự án

Hệ thống RESTful API quản lý Nhân viên (Employee Management) với các chức năng:
- CRUD nhân viên (Create, Read, Update, Delete)
- AOP Logging tự động (3 advice: Before, AfterReturning, Around)
- Structured Logging với SLF4J (INFO / WARN / ERROR)
- Unit Testing với JUnit 5 + Mockito
- Dữ liệu lưu in-memory (ArrayList)

---

## 👥 Phân công nhóm

| Thành viên | Phần phụ trách | Files |
|---|---|---|
| **Trần Đăng Việt** | Model + Exception | `Employee.java`, `EmployeeNotFoundException.java` |
| **Lê Duy Minh** | Service | `EmployeeService.java` |
| **Lê Tiến Đức** | Controller | `EmployeeController.java` |
| **Phùng Văn Vượng** | AOP Logging | `LoggingAspect.java` |
| **Phạm Phương Anh** | Test + Postman + README | `EmployeeServiceTest.java`, `EmployeeControllerTest.java`, Postman Collection |

---

## 📂 Cấu trúc thư mục

```
src/main/java/org/example/employeemanagement/
├── aspect/         → LoggingAspect.java          (Phùng Văn Vượng)
├── controller/     → EmployeeController.java     (Lê Tiến Đức)
├── exception/      → EmployeeNotFoundException.java (Trần Đăng Việt)
├── model/          → Employee.java               (Trần Đăng Việt)
├── service/        → EmployeeService.java        (Lê Duy Minh)
└── EmployeemanagementApplication.java

src/test/java/org/example/employeemanagement/
├── service/        → EmployeeServiceTest.java    (Phạm Phương Anh)
└── controller/     → EmployeeControllerTest.java (Phạm Phương Anh)

postman/
└── EmployeeManagement.postman_collection.json    (Phạm Phương Anh)
```

---

## 🚀 Hướng dẫn chạy dự án

### Yêu cầu
- Java 17+
- Gradle (hoặc dùng Gradle Wrapper có sẵn)
- IntelliJ IDEA (khuyến nghị)

### Chạy ứng dụng
```bash
# Windows
.\gradlew.bat bootRun

# Linux/Mac
./gradlew bootRun
```

### Chạy Unit Test
```bash
# Windows
.\gradlew.bat test

# Linux/Mac
./gradlew test
```

### Base URL
```
http://localhost:8080
```

---

## 📡 API Endpoints

| Method | Endpoint | Mô tả | Status OK | Status Error |
|---|---|---|---|---|
| `GET` | `/api/employees` | Lấy danh sách tất cả nhân viên | 200 OK | — |
| `GET` | `/api/employees/{id}` | Lấy chi tiết nhân viên theo ID | 200 OK | 404 Not Found |
| `POST` | `/api/employees` | Thêm nhân viên mới (ID tự động) | 201 Created | 400 Bad Request |
| `PUT` | `/api/employees/{id}` | Cập nhật toàn bộ thông tin nhân viên | 200 OK | 404 Not Found |
| `DELETE` | `/api/employees/{id}` | Xóa nhân viên theo ID | 204 No Content | 404 Not Found |

### Ví dụ Request Body (POST / PUT)
```json
{
  "fullName": "Nguyen Van A",
  "department": "Engineering",
  "salary": 15000000
}
```

---

## 🔧 Hướng dẫn làm việc nhóm (Git Workflow)

### Bước 1: Clone dự án
```bash
git clone <repository-url>
cd employeemanagement
```

### Bước 2: Tạo branch riêng
```bash
# Mỗi người tạo branch theo tên mình
git checkout -b feature/ten-thanh-vien

# Ví dụ:
git checkout -b feature/viet-model
git checkout -b feature/minh-service
git checkout -b feature/duc-controller
git checkout -b feature/vuong-aspect
git checkout -b feature/anh-test
```

### Bước 3: Code trong file được phân công
- Mở file skeleton tương ứng
- Đọc hướng dẫn trong comment
- Viết code thay thế `// TODO: Viết code tại đây`

### Bước 4: Commit & Push
```bash
git add .
git commit -m "feat: implement [tên phần] by [tên thành viên]"
git push origin feature/ten-thanh-vien
```

### Bước 5: Tạo Pull Request
- Tạo PR trên GitHub từ branch của mình vào `main`
- Tag các thành viên khác review

### ⚠️ THỨ TỰ MERGE KHUYẾN NGHỊ:
1. **Model + Exception** (Trần Đăng Việt) → merge trước
2. **Service** (Lê Duy Minh) → merge sau Model
3. **Controller** (Lê Tiến Đức) → merge sau Service
4. **AOP Logging** (Phùng Văn Vượng) → merge sau Controller
5. **Test + Postman** (Phạm Phương Anh) → merge cuối cùng

---

## 🧪 Kiểm thử Postman

Import file `postman/EmployeeManagement.postman_collection.json` vào Postman và test 8 trường hợp:

1. ✅ GET all employees (200)
2. ✅ GET employee by id – thành công (200)
3. ✅ GET employee by id – không tìm thấy (404)
4. ✅ POST – thêm nhân viên mới (201)
5. ✅ PUT – cập nhật nhân viên (200)
6. ✅ PUT – không tìm thấy (404)
7. ✅ DELETE – xóa thành công (204)
8. ✅ DELETE – không tìm thấy (404)
9. 📸 Chụp console log hiển thị AOP log khi gọi API

---

## 📚 Tài liệu tham khảo

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring AOP Guide](https://docs.spring.io/spring-framework/reference/core/aop.html)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Mockito Documentation](https://javadoc.io/doc/org.mockito/mockito-core/latest/)
