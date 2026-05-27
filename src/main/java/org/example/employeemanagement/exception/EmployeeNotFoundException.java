package org.example.employeemanagement.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Không tìm thấy nhân viên với mã: " + id);
    }

}
