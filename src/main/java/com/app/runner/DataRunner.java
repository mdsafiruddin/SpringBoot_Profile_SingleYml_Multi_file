package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {
	@Value("${my.data.message}")
	private String message;
	@Value("${my.data.code}")
	private String code;
	@Value("${my.data.mode}")
	private String mode;
	
	

	@Override
	public String toString() {
		return "DataRunner [message=" + message + ", code=" + code + ", mode=" + mode + "]";
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
