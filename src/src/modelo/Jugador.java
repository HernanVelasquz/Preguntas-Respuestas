/**
 * Modelo encargado de recibir los datos del jugador,
 * y poder conectarse a otros modelos para facilitar la comunicacion.
 */
package modelo;


public class Jugador {
    private String nombre;
    private String apellido;
    private String email;

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}
