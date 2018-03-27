package com.fnsystems.crownsecurity.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/aboutus").setViewName("aboutus");
		registry.addViewController("/mission").setViewName("mission");
		registry.addViewController("/recruitment").setViewName("recruitment");
		registry.addViewController("/booking").setViewName("booking");
	}
}
