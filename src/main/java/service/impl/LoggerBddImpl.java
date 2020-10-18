package service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

import conf.ConexionBD;
import service.LoggerInterface;

public class LoggerBddImpl implements LoggerInterface {
	
	@Value("${level.log.bdd}")
	public String logLevel;

	@Override
	public void loggerBuild(String message) {
		ConexionBD conexion = new ConexionBD();
        Connection con = conexion.getConnection();
        
        String query = "INSERT INTO logmessages (id_message, message) VALUES (?, ?)";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setInt(1, 11);
            preparedStatement.setString(2, message);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            con.close();

            System.out.println("Llamada agregada con éxito a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
        }
		
	}

}
