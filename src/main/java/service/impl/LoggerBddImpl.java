package service.impl;

import org.springframework.beans.factory.annotation.Value;
import service.LoggerInterface;

public class LoggerBddImpl implements LoggerInterface {
	
	@Value("${level.log.bdd}")
	public String logLevel;

	@Override
	public void loggerBuild(String message) {
		// TODO Auto-generated method stub
		
	}

}
