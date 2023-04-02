package com.chen;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {
    //前置通知
    @Before(value = "pointCut()")
    public void beforeMounted(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeMounted: methodName==>" + name + ",params==>" + Arrays.toString(args));
    }

    //后置通知
    @AfterReturning(value = "pointCut()")
    public void afterReturning(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("afterReturning: methodName==>" + name + ",params==>" + Arrays.toString(args));
    }

    @Pointcut(value = "execution(public * com.chen.CalculatorImpl.*(..))")
    public void pointCut(){

    }
}
