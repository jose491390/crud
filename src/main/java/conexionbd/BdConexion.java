package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class BdConexion {
    
    public Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String BD_URL = "jdbc:mysql://localhost:3306/crud";
    
    private final String user = "root";
    private final String password = "";
    
    public void conectar(){
        try {
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(BD_URL, user, password);  
        } catch (ClassNotFoundException | SQLException e) {
        }
        
    }
    
    public void cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
