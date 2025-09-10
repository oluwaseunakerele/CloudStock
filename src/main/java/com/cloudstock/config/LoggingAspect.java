package com.cloudstock.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

  @Around("execution(public * com.cloudstock..*(..))")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
    String m = pjp.getSignature().toShortString();
    log.info("ENTER {}", m);
    try {
      Object out = pjp.proceed();
      log.info("EXIT  {}", m);
      return out;
    } catch (Exception ex) {
      log.error("EXCEPTION in " + m, ex);
      throw ex;
    }
  }
}
