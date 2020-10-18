package com.challengesoaint.challengeSoaint;

import org.springframework.boot.SpringApplication;

import service.impl.LoggerConsoleImpl;
import service.impl.LoggerFileImpl;


public class ChallengeSoaintApplication {

	public static void main(String[] args) {
			
		SpringApplication.run(ChallengeSoaintApplication.class, args);
		
		LoggerConsoleImpl consoleImpl = new LoggerConsoleImpl();
		consoleImpl.loggerBuild("Hola Mundo");	
	
		LoggerFileImpl fileImpl = new LoggerFileImpl();
		fileImpl.loggerBuild("Hola Mundo");	
		
		System.out.println("Fin");
	}

}
