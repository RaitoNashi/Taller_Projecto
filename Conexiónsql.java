package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * FXML Controller class
 *
 * @author 54255702
 */
public class Conexiónsql {
//Acá estoy creando todo los datos para la conexión
    private Connection connection;
    private String usuario = "root";
    private String password = "";
    private String servidor = "localhost";
    private String puerto = "3306";
    private String nombreBD = "ferreteria";
    private String url = "jdbc:mysql://localhost:3306/ferreteria"; //?serverTimezone=UTC
   private String driver = "com.mysql.jdbc.Driver"; //fue la mejor pelea del mundo contra una bibliotecta de mierda
    //acá pasa toda la magia 
    public Conexiónsql() {
        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url, usuario, password);
            if (connection != null) {
                System.out.println("Exitos en todo");
            }
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos:" + e.getMessage());
        } catch (InstantiationException ex) {
            Logger.getLogger(Conexiónsql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Conexiónsql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    
}
