
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Jugador;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.Categoria;
import vista.VistaInicioJuego;

public class ControllerPreguntas implements ActionListener{
    
    private Jugador jugador;
    private Pregunta pregunta;
    private Respuesta respuesta;
    private Categoria categoria;
    private VistaInicioJuego vwJuego;
    
    public ControllerPreguntas(Jugador jugador, Pregunta pregunta,Categoria categoria,Respuesta respuesta,VistaInicioJuego vwJuego){
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.vwJuego = vwJuego;
        this.categoria = categoria;
        this.vwJuego.btnStart.addActionListener(this);
        this.vwJuego.btnSalir.addActionListener(this);
        this.vwJuego.btnSiguiente.addActionListener(this);
        this.vwJuego.btnTerminar.addActionListener(this);
        this.vwJuego.rbtnA.addActionListener(this);
        this.vwJuego.rbtnB.addActionListener(this);
        this.vwJuego.rbtnC.addActionListener(this);
        this.vwJuego.rbtnD.addActionListener(this);
    }
    
    public void startView(){
        this.vwJuego.setTitle("Preguntados Pon a prueba tu conocimiento");
        this.vwJuego.setLocationRelativeTo(null);
        
    }
     
     
    @Override
    public void actionPerformed(ActionEvent e) {
        int numero = this.obtenerNumero(); 
        boolean decision; 
        if(e.getSource() == this.vwJuego.btnStart){
            this.vwJuego.txtPuntos.setText(Integer.toString(this.categoria.getPuntos()));
            this.vwJuego.txtNivel.setText(Integer.toString(this.categoria.getNivel()));
            this.vwJuego.txtPreguntas.setText(this.pregunta.getPregunta(numero));
            this.vwJuego.txtListaRespuesta.setText(this.respuesta.obtenerResputa(numero));
            this.vwJuego.btnStart.setEnabled(false);
            this.vwJuego.btnSalir.setEnabled(false);
            this.vwJuego.rbtnA.setEnabled(true);
            this.vwJuego.rbtnB.setEnabled(true);
            this.vwJuego.rbtnC.setEnabled(true);
            this.vwJuego.rbtnD.setEnabled(true);
            this.vwJuego.btnSiguiente.setEnabled(true);
            this.vwJuego.btnTerminar.setEnabled(true);
            this.vwJuego.grupoOpciones.clearSelection();
        }else if(e.getSource() == this.vwJuego.btnSalir){
            this.vwJuego.dispose();
        }else if(e.getSource() == this.vwJuego.btnSiguiente){
            this.vwJuego.txtPreguntas.setText(this.pregunta.getPregunta(numero));
            this.vwJuego.txtListaRespuesta.setText(this.respuesta.obtenerResputa(numero));
            decision = this.respuesta.evaluarRespuesta(this.obtenerRepuestaSeleccionada(), numero);
            this.evaludar(decision);
        }else if(e.getSource() == this.vwJuego.btnTerminar){
            this.vwJuego.btnStart.setEnabled(true);
            this.vwJuego.btnSalir.setEnabled(true);
            this.vwJuego.rbtnA.setEnabled(false);
            this.vwJuego.rbtnB.setEnabled(false);
            this.vwJuego.rbtnC.setEnabled(false);
            this.vwJuego.rbtnD.setEnabled(false);
            this.vwJuego.btnSiguiente.setEnabled(false);
            this.vwJuego.btnTerminar.setEnabled(false);
            this.clean();
            this.formulario();
        }
    }
    
    private int obtenerNumero(){
        return this.categoria.generarNumberPregunta();
    }
    
    private String obtenerRepuestaSeleccionada(){
        String seleccion = null;
        if(this.vwJuego.rbtnA.isSelected()){
            seleccion = "A";
        }else if(this.vwJuego.rbtnB.isSelected()){
            seleccion = "B";
        }else if(this.vwJuego.rbtnC.isSelected()){
            seleccion = "C";
        }else if(this.vwJuego.rbtnD.isSelected()){
            seleccion = "D";
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione Una respuesta");
        }
        
        return seleccion;
    }
    
    private void evaludar(boolean obtenido){
        int puntos;
       if(obtenido == false){
            this.vwJuego.btnStart.setEnabled(true);
            this.vwJuego.btnSalir.setEnabled(true);
            this.vwJuego.rbtnA.setEnabled(false);
            this.vwJuego.rbtnB.setEnabled(false);
            this.vwJuego.rbtnC.setEnabled(false);
            this.vwJuego.rbtnD.setEnabled(false);
            this.vwJuego.btnSiguiente.setEnabled(false);
            this.vwJuego.btnTerminar.setEnabled(false);
            this.clean();
            this.formulario();
       }else{
            this.vwJuego.grupoOpciones.clearSelection();
            puntos = this.categoria.aumentarPuntos();
            this.vwJuego.txtPuntos.setText(Integer.toString(puntos));
            this.categoria.aumentarNivel();

       }
    }
    
    private void formulario(){
        String nombre, apellido, email;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su Apellido: ");
        email = JOptionPane.showInputDialog("Ingrese su Emial: ");
        this.jugador.setNombre(nombre);
        this.jugador.setApellido(apellido);
        this.jugador.setEmail(email);
        this.categoria.guardarRegistro(this.jugador);
    }
    
    public void clean(){
        this.vwJuego.txtPreguntas.setText(null);
        this.vwJuego.txtListaRespuesta.setText(null);
    }
    
    
}
