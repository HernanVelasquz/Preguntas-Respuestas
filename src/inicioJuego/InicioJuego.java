
package inicioJuego;

import controlador.ControllerPreguntas;
import modelo.ConsultasDB;
import modelo.Pregunta;
import modelo.Jugador;
import vista.VistaInicioJuego;

public class InicioJuego {
    public static void main(String[] args) {
        Pregunta pregunta = new Pregunta();
        Jugador jugador = new Jugador();
//        ConsultasDB consult = new ConsultasDB();    
        VistaInicioJuego vista = new VistaInicioJuego();
        
        
        ControllerPreguntas controller = new ControllerPreguntas(jugador, pregunta, vista);
        
        controller.startView();
        vista.setVisible(true);
    }
}
