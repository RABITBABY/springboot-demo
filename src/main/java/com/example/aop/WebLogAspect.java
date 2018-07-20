package com.example.aop;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.example.util.JSONResult;

@Aspect
@Component
public class WebLogAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Pointcut("execution(public * com.example.controller..*.*(..))")
    public void webLog(){
        
    }
    
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        System.out.println("---------------------------");
        System.out.println("URL : " + request.getRequestURL().toString());
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            logger.info("name:{},value:{}", name, request.getParameter(name));
        }        
    }
    
    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint){
    	JSONResult<Object> result = null;
    	try {
			return proceedingJoinPoint.proceed();
		}catch (Exception e) {
			// TODO Auto-generated catch block
        	result=new JSONResult<Object>();
        	result.setStatus(1);
        	result.setMsg("系统异常！");
        	logger.error("【系统异常】{}",e);
        	System.err.println(e);
        	return result;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
        	result=new JSONResult<Object>();
        	result.setStatus(1);
        	result.setMsg("系统异常！");
        	logger.error("【系统异常】{}",e);
        	System.err.println(e);
        	return result;
		}
       
    }
    
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
        System.out.println("---------------------------");
        System.out.println("RESPONSE : " + ret);
    }
}