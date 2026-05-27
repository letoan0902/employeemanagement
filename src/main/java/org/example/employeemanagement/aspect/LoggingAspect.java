package org.example.employeemanagement.aspect;

// ====================================================================
// 📋 PHÂN CÔNG: Phùng Văn Vượng
// 📁 FILE: aspect/LoggingAspect.java
// 📝 MÔ TẢ: AOP Logging - Tự động log request/response/thời gian thực thi
// ====================================================================
//
// ▶ HƯỚNG DẪN THỰC HIỆN:
//
// 1. ANNOTATION TRÊN CLASS:
//    - @Aspect    → Đánh dấu đây là Aspect class (AOP)
//    - @Component → Đăng ký vào Spring Container
//
// 2. IMPORT CẦN THIẾT:
//    - org.aspectj.lang.JoinPoint
//    - org.aspectj.lang.ProceedingJoinPoint
//    - org.aspectj.lang.annotation.*
//    - org.slf4j.Logger
//    - org.slf4j.LoggerFactory
//    - org.springframework.stereotype.Component
//
// 3. KHAI BÁO LOGGER:
//    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
//
// 4. CÁC ADVICE CẦN IMPLEMENT (3 advice):
//
//    ┌─────────────────┬────────────────────────────┬──────────────────────────────┐
//    │ Advice Type      │ Pointcut                   │ Hành vi                      │
//    ├─────────────────┼────────────────────────────┼──────────────────────────────┤
//    │ @Before          │ controller package methods │ Log tên method đang gọi      │
//    │ @AfterReturning  │ service package methods    │ Log kết quả trả về           │
//    │ @Around          │ controller package methods │ Đo thời gian thực thi (ms)   │
//    └─────────────────┴────────────────────────────┴──────────────────────────────┘
//
//    ─────────────────────────────────────────────────────────────
//    a) @Before - Log tên method controller đang được gọi
//    ─────────────────────────────────────────────────────────────
//    @Before("execution(* org.example.employeemanagement.controller.*.*(..))")
//    public void logBeforeController(JoinPoint joinPoint) {
//        // Lấy tên method: joinPoint.getSignature().getName()
//        // Log: logger.info("▶ [BEFORE] Calling method: {}", methodName);
//        // TODO: Implement
//    }
//
//    ─────────────────────────────────────────────────────────────
//    b) @AfterReturning - Log kết quả trả về từ service
//    ─────────────────────────────────────────────────────────────
//    @AfterReturning(
//        pointcut = "execution(* org.example.employeemanagement.service.*.*(..))",
//        returning = "result"
//    )
//    public void logAfterService(JoinPoint joinPoint, Object result) {
//        // Lấy tên method: joinPoint.getSignature().getName()
//        // Log: logger.info("◀ [AFTER RETURNING] Method: {} | Result: {}", methodName, result);
//        // TODO: Implement
//    }
//
//    ─────────────────────────────────────────────────────────────
//    c) @Around - Đo thời gian thực thi method controller
//    ─────────────────────────────────────────────────────────────
//    @Around("execution(* org.example.employeemanagement.controller.*.*(..))")
//    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
//        // Bước 1: Ghi nhận thời gian bắt đầu
//        //   long startTime = System.currentTimeMillis();
//        //
//        // Bước 2: Thực thi method gốc
//        //   Object result = joinPoint.proceed();
//        //
//        // Bước 3: Tính thời gian thực thi
//        //   long duration = System.currentTimeMillis() - startTime;
//        //
//        // Bước 4: Log kết quả
//        //   logger.info("⏱ [AROUND] Method: {} executed in {} ms", methodName, duration);
//        //
//        // Bước 5: return result (BẮT BUỘC!)
//        //
//        // TODO: Implement
//        return null; // Thay bằng code thực tế
//    }
//
// ====================================================================
// 💡 GIẢI THÍCH POINTCUT EXPRESSION:
//    execution(* org.example.employeemanagement.controller.*.*(..))
//    │         │  │                                        │ │ │
//    │         │  │                                        │ │ └─ Mọi tham số
//    │         │  │                                        │ └─── Mọi method
//    │         │  │                                        └───── Mọi class
//    │         │  └────────────────────────────────────────────── Package
//    │         └──────────────────────────────────────────────── Mọi kiểu trả về
//    └────────────────────────────────────────────────────────── Từ khóa execution
//
// 💡 LƯU Ý QUAN TRỌNG:
//    - @Around advice PHẢI return result từ joinPoint.proceed()
//    - Nếu không return, controller sẽ trả về null
//    - ProceedingJoinPoint chỉ dùng được với @Around
//    - JoinPoint dùng cho @Before, @After, @AfterReturning, @AfterThrowing
// ====================================================================

public class LoggingAspect {

    // TODO: Viết code tại đây

}
