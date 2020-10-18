package service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import service.LoggerInterface;

@Service
public class LoggerConsoleImpl implements LoggerInterface {

	@Value("${level.log.console}")
	private String levelLogConsole;

	public String getLevelLogConsole() {
		return levelLogConsole;
	}

	public void setLevelLogConsole(String levelLogConsole) {
		this.levelLogConsole = levelLogConsole;
	}

	@Override
	public void loggerBuild(String message) {
		System.out.println(new Date() + " " + this.levelLogConsole + " - " + message);
	}
	
}
