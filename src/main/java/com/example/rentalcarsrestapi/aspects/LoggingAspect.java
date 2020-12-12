package com.example.rentalcarsrestapi.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution(* com.example.rentalcarsrestapi.controllers..*(..))")
    public void allMethods(){}

    @After("allMethods()")
    public void loggAfter(JoinPoint joinPoint) {
        logger.info("After executed method: " + joinPoint.getSignature().getName() + " by: " + SecurityContextHolder.getContext().getAuthentication().getName());
    }
}