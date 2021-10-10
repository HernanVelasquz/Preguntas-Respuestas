
package inicioJuego;

import controlador.ControllerPreguntas;
import modelo.Pregunta;
import modelo.Jugador;
import modelo.Categoria;
import modelo.Respuesta;
import vista.VistaInicioJuego;

public class InicioJuego {
    public static void main(String[] args) {
        Pregunta pregunta = new Pregunta();
        Respuesta respuesta = new Respuesta();
        Jugador jugador = new Jugador();
        Categoria categoria = new Categoria();
        VistaInicioJuego vista = new VistaInicioJuego();
        
        
        ControllerPreguntas controller = new ControllerPreguntas(jugador, pregunta, categoria,respuesta ,vista);
        
        controller.startView();
        vista.setVisible(true);
    }
}
