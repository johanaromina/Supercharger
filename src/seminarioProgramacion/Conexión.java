package seminarioProgramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión {
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String USUARIO = "supercharger";
	private static final String CLAVE = "pr4ct1c4pr0gr4m4c10n";

	static {
		
		try {
			
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			LogErrores.escribirLog("Error al cargar el controlador.");
		}
	}
	
	public Connection conectar() {
		
		Connection conexion = null;
		String URL= "jdbc:mysql://localhost:3306/lecsys?serverTimezone=UTC";
	
		try {
			
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
		} catch (SQLException e) {
			
			LogErrores.escribirLog("Error al acceder a la base de datos.");
			LogErrores.escribirLog(URL);
		}
		return conexion;
	}
}