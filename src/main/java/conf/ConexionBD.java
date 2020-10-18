package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
    private String servidor = "jdbc:mysql://localhost:3306/centralitabd";
    private String username = "root";
    private String password = "123456789";
    private String driver = "com.mysql.jdbc.Driver";

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
