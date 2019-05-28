package com.core.server;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class Server implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		// TODO Auto-generated method stub
		factory.setContextPath("/Lavada");
	}

	
	

}
