package com.challengesoaint.challengeSoaint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.impl.LoggerConsoleImpl;
import service.impl.LoggerFileImpl;

@SpringBootApplication
public class ChallengeSoaintApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ChallengeSoaintApplication.class, args);	
		LoggerConsoleImpl loggerConsoleImpl = new LoggerConsoleImpl();
		loggerConsoleImpl.loggerBuild("Logger in console");
		
		LoggerFileImpl loggerFileImpl = new LoggerFileImpl();
		loggerFileImpl.loggerBuild("Logger in file");
		
		/*LoggerBddImpl loggerBddImpl = new LoggerBddImpl();
		loggerBddImpl.loggerBuild("Logger in BD");*/

	}

}
