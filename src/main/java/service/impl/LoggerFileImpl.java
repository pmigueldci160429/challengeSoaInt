package service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import service.LoggerInterface;

@Service
public class LoggerFileImpl implements LoggerInterface {
	
	@Value("${level.log.file}")
	public String levelLogFile;
	
	@Value("${log.file.path}")
	public String filePath;

	@Override
	public void loggerBuild(String message) {
		try {
            String ruta = "D:/loggerFile.txt";
            File file = new File(ruta);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(buildMessagge(message));
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	private String buildMessagge(String message) {
		return new Date() + " " + this.levelLogFile + " - " + message;
	}

}
