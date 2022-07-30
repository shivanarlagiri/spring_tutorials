package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sports.properties")
public class SportsConfiguration {
	
	@Bean
	public MyLoggerAnnotationConfig MyLoggerAnnotationConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {

		MyLoggerAnnotationConfig myLoggerConfig = new MyLoggerAnnotationConfig(rootLoggerLevel, printedLoggerLevel);

		return myLoggerConfig;
	}

}
