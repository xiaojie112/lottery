package com.xj.springaop.aspect;

import com.xj.springaop.annotation.MyAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-19
 */
@Aspect
@Component
public class UserAspect1 {
    @Pointcut("@annotation(com.xj.springaop.annotation.MyAnnotation)")
    public void aspect(){}

    @Before(value = "aspect() && @annotation(myano) && args(param)")
    public void beforeAdvice(JoinPoint jp, String param, MyAnnotation myano){
        System.out.println(param);
        System.out.println(myano.info());
        System.out.println(jp);
    }
}
