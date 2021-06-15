package com.demo_ScienceDirect.aop;


import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class Log {
private static final Logger logger =Logger.getLogger(Log.class);

public void entreemethode(){
logger.info("this is my custom aop and it's working");
}



}

