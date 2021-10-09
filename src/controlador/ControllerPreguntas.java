
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ConsultasDB;
import modelo.Jugador;
import modelo.Pregunta;
import vista.VistaInicioJuego;

public class ControllerPreguntas implements ActionListener{
    
    private Jugador jugador;
    private Pregunta pregunta;
//    private ConsultasDB consult;
    private VistaInicioJuego vwJuego;
    
    public ControllerPreguntas(Jugador jugador, Pregunta pregunta,VistaInicioJuego vwJuego){
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.vwJuego = vwJuego;
        this.vwJuego.btnStart.addActionListener(this);
        this.vwJuego.btnSalir.addActionListener(this);
    }
    
    public void startView(){
        this.vwJuego.setTitle("Preguntados Pon a prueba tu conocimiento");
        this.vwJuego.setLocationRelativeTo(null);
        
    }
    
    
//     public void clean(){
//        this.vwJuego.textNombre.setText(null);
//        this.vwJuego.textApellido.setText(null);
//        this.vwJuego.textEmail.setText(null);
//    }
     
     
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.vwJuego.btnStart){
//            System.out.println(this.pregunta.reedFilePregunta());
//            this.vwJuego.txtPreguntas.setText(this.vwJuego.txtPreguntas.getText().toString() + this.pregunta.getPregunta());
//            ArrayList<String> datos = this.pregunta.reedFilePregunta();
//            datos.forEach(elemt -> {
//                this.vwJuego.txtPreguntas.setText(this.vwJuego.txtPreguntas.getText().toString() + this.pregunta.getPregunta());
//            });
        }
//            this.consult.obtenerRegistros(jugador);
//            this.jugador.setNombre(this.vwJuego.textNombre.getText());
//            this.jugador.setApellido(this.vwJuego.textApellido.getText());
//            this.jugador.setEmail(this.vwJuego.textEmail.getText());
//            
//            if(this.vwJuego.textNombre.getText() != "" && this.vwJuego.textApellido.getText() != "" && this.vwJuego.textEmail.getText() != ""){
//                 if(consult.resgistrarInformacion(this.jugador)){
//                    JOptionPane.showMessageDialog(null, "Puntos Guardados");
//                    this.clean();
//                }else{
//                    JOptionPane.showMessageDialog(null, "Error al guardar");
//                    this.clean();
//                }
//            }else{
//                JOptionPane.showMessageDialog(null, "Ingrese todos los datos de manera correcta");
//            }
//            
//        }else if (e.getSource() == this.vwJuego.btnSalir){}
//                
//        }
        
    }
    
    
   
    
}
