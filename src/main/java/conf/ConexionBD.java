package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class ConexionBD {
	@Value("${server}")
    private String servidor;
	@Value("${username}")
    private String username;
	@Value("${password}")
    private String password;
	@Value("${driver}")
    private String driver;

    private Connection con;

    public void Conexion() throws ClassNotFoundException
    {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(servidor, username, password);

            System.out.println("Conexión realizada a la base de datos con éxito.");
        } catch (SQLException e) {
            System.out.println("Error!, conexión fallida a la base de datos.");
        }
    }

    public Connection getConnection() {
        return con;
    }

	
}
