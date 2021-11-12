package com.example.simpleaopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class InterAspect {

    @Before("@annotation(com.example.simpleaopdemo.aspects.Interceptor)")
    public void checkSomethingBefore(JoinPoint joinPoint) {

        RequestAttributes requestAtts = RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = ((ServletRequestAttributes)(requestAtts)).getRequest();
        try {
            System.out.println("hello" + request.getHeader("auth"));
        } catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Before execution - Roles: " + Arrays.toString(getInterceptor(joinPoint).roles()));
    }

    @After("@annotation(com.example.simpleaopdemo.aspects.Interceptor)")
    public void checkSomethingAfter(JoinPoint joinPoint) {
        System.out.println("After execution - Roles: " + Arrays.toString(getInterceptor(joinPoint).roles()));
    }

    @Around("@annotation(com.example.simpleaopdemo.aspects.Interceptor)")
    public void checkSomethingAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Before in Around execution - Roles: " + Arrays.toString(getInterceptor(joinPoint).roles()));
        joinPoint.proceed();
        System.out.println("After in Around execution - Roles: " + Arrays.toString(getInterceptor(joinPoint).roles()));
    }

    public Interceptor getInterceptor(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Interceptor myAnnotation = method.getAnnotation(Interceptor.class);
        return myAnnotation;
    }


}
