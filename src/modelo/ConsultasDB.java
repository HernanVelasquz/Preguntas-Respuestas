package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConsultasDB extends Conexion {
    
    private Connection conect =  getConexion();
    private PreparedStatement prepared = null;
    
    public boolean resgistrarInformacion(Jugador jugador){      
        String sqlInsert = "INSERT INTO jugador (nombre, apellido, email, puntaje, nivel) VALUES (?,?,?,?,?)";
        try {   
            this.prepared = this.conect.prepareStatement(sqlInsert);
            this.prepared.setString(1, jugador.getNombre());
            this.prepared.setString(2, jugador.getApellido());
            this.prepared.setString(3, jugador.getEmail());
            this.prepared.setInt(4,11);
            this.prepared.setInt(5,25); 
            this.prepared.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try {
                this.conect.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean obtenerRegistros(Jugador jugador){
        
        String sqlGetInfo = "SELECT nombre, apellido, puntaje, nivel FROM jugador WHERE email = ?";
        ResultSet result = null;
        try {
            this.prepared = this.conect.prepareStatement(sqlGetInfo);
            this.prepared.setString(1, jugador.getEmail());
            result = prepared.executeQuery();
            if(result.next()){
//                jugador.setNombre(result.getString("Nombre"));
//                jugador.setApellido(result.getString("Apellido"));
//                jugador.setPuntos(Integer.parseInt(result.getString("Puntos")));
//                jugador.setNivel(Integer.parseInt(result.getString("Nivel")));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try {
                conect.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
//    public boolean obtenerPregunta(Jugador jugador){
//        String sqlGetPregunta = "SELECT * FROM preguntas WHERE nivel = 1 && id = 2";
//        ResultSet result = null;
//        
//        try {
//            this.prepared = this.conect.prepareCall(sqlGetPregunta);
//            this.prepared.setString(1, Categoria.getCategoria());
//            this.prepared.setString(2, categoria.getCategoria());
//            result = this.prepared.executeQuery();
//            if (result.next()) {
//                jugador.getPregunta();
//            }
//        } catch (Exception e) {
//        }
//    }
}
