
package modelo;
import com.mysql.cj.MysqlConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.DriverManager;
//import java.sql.SQLException;
 /* 
 * Clase encargade de hacer las conexciones a la base de datos
*/
public class Conexion {
    private final String dataBase = "questions";
    private final String user = "root";
    private final String passwd = "01251903";
    private final String urlDatabase = "jdbc:mysql://localhost:3306/questions";
    Connection conect = null;
    
//    public Conexion(){
//        try {
//            Class.forName("com.msql.jdbc.Driver");
//            this.conect = DriverManager.getConnection(this.user, user, passwd);
//        } catch (Exception e) {
//        }
//    }
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conect = DriverManager.getConnection(this.urlDatabase, this.user, this.passwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return conect; 
    }
}
