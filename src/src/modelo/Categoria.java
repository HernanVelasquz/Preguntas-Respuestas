
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Categoria {
    private int nivel;
    private int puntos = 0;
    private Vector principalInfo;
    
    public Categoria() {
        this.nivel = 1;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }
    

    public int generarNumberPregunta(){
        return (int) (Math.random()*25);
    }
    
    public int aumentarPuntos(){
        return this.puntos +=5;
    }
    
    public int aumentarNivel(){
        if(this.puntos == 25){ 
            return this.nivel = 2;
        }else if( this.puntos == 50){
            return this.nivel = 3;
        }else if( this.puntos == 75){
            return this.nivel = 4;
        }else {
            return this.nivel = 5;
        }
    }
    
    public void guardarRegistro(Jugador jugador){
        principalInfo = new Vector();
        principalInfo.addElement(jugador);
        try {
            FileWriter file = new FileWriter("registros.txt", true);
            BufferedWriter bw = new BufferedWriter(file);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(jugador.getNombre());
            pw.print("|"+jugador.getApellido());
            pw.print("|"+jugador.getEmail());
            pw.print("|"+this.getPuntos());
            pw.print("|"+this.getNivel());
            pw.print('\n');
            pw.close();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
