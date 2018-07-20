package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {
	/**
	 * 使用内置tomcat要放开这段代码。使用外置tomcat要注释掉
	 */
//    @Bean
//    public ServerEndpointExporter serverEndpointExporter() {
//        return new ServerEndpointExporter();
//    }

}