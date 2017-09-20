package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class Chap05Application {

	public static void main(String[] args) {
		SpringApplication.run(Chap05Application.class, args);
	}
	
	@Bean
	InternalResourceViewResolver jspView() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		vr.setViewNames("jsp/*");
		vr.setViewClass(JstlView.class);
		
		return vr;
	}
	
}
