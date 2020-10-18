package service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import service.LoggerInterface;

@Service
public class LoggerConsoleImpl implements LoggerInterface {
	
	@Autowired
    Environment enviroment;
	
	@Value("${level.log.console}")
	private String levelLogConsole;
	
	
	public String getLevelLogConsole() {
		return enviroment.getProperty("level.log.console");
	}

	@Override
	public void loggerBuild(String message) {
		System.out.println(new Date() + " " + getLevelLogConsole() + " - " + message);
	}
	
}
