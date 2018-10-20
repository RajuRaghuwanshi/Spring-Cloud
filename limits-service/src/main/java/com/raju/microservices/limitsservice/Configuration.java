package com.raju.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Spring boot this is the better way to inject the configuration metadata into the application
//another option is using by @value annotation
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum;
	private int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
