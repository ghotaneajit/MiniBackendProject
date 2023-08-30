package com.example.demo.appProps;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@EnableConfigurationProperties
@ConfigurationProperties(prefix="planapi")
@Configuration 
public class AppProps {
	
	//from yml file we are copy the configuration and saving in to this message properties

	private Map <String, String> message = new HashMap<String, String>();

	public Map<String, String> getMessage() {
		return message;
	}

	public void setMessage(Map<String, String> message) {
		this.message = message;
	}

	public AppProps() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppProps(Map<String, String> message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "AppProps [message=" + message + "]";
	}
	
}
