package org.example.employeemanagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* org.example.employeemanagement.controller.*.*(..))")
    public void logBeforeController(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        logger.info("Đang gọi method controller: {}", methodName);
    }

    @AfterReturning(
            pointcut = "execution(* org.example.employeemanagement.service.*.*(..))",
            returning = "result"
    )
    public void logAfterService(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();

        logger.info("Method service: {} trả về kết quả: {}", methodName, result);
    }

    @Around("execution(* org.example.employeemanagement.controller.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - startTime;
        String methodName = joinPoint.getSignature().getName();

        logger.info("Method: {} thực thi trong {} ms", methodName, duration);

        return result;
    }
}