package com.kodilla.patterns2.facade.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {

    private static final Logger LOGGER = LoggerFactory.getLogger(Aspects.class);

    @Pointcut("execution (public * com.kodilla.patterns2.facade.ShopService..*(..))")
    public void executeOnAnyPublicMethodForShopServices() {}

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void getLogEventForOrderFacadeMethods() {
        LOGGER.info("Logging this event");
    }

    @Before("executeOnAnyPublicMethodForShopServices()")
    public void getLogEventForShopServicesMethods() {
        LOGGER.info("Logging this event");
    }
}
