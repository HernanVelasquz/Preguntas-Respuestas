
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Pregunta {
    private String[] pregunta = {
        "Cual de las siguientes opciones corresponden a tipos de Sistemas Operativos Existentes en el mercado.",
        "¿Que programa de ofimática utilizamos para escribir cartas?",
        "Cuando realizamos dibujos y hacemos edicion de imagenes en la computadora lo podemos hacer con algunos de estos programas, ¿cuales son?",
        "¿Qué función cree usted que cumplan los dispositivos que están conectados a la computadora?",
        "¿Cuáles cree que permiten la salida de información?",
        "Menciona ¿que son Dispositivos de Almacenamiento?",
        "¿Que son Dispositivos de Comunicaciones?",
        "Barra de tareas",
        "La barra de desplazamiento permite",
        "Indique ¿cuál es la combinación de teclas que sirve para cerrar una ventana?",
        "Un Hipervínculo es:",
        "¿Cuándo Abrimos Word que menú es el que nos aparece Inicialmente?",
        "Formula que permite sumar los valores desde la celda A1 hasta la celda A33.",
        "¿Para poder Mover los márgenes de Izq-Der que herramientas ocupamos?",
        "¿Cómo se le llaman a los Atributos que tiene un documento?",
        "¿Con que herramienta podemos hacer que una(s) palabra(s) sobresalgan del demás texto?",
        "¿Las opciones de Negritas, Cursivas, Subrayado, Tachado, Tipo de Letra, Tamaño, etc., Como se le conoce a todas esas herramientas?",
        "¿Cuál de las estas maneras podemos Abrir Word?",
        "Manuel necesita un programa para poder editar documentos. ¿Que programa le recomiendas?",
        "Consiste en la reparación de alguno de los componentes de la computadora, puede ser una soldadura pequeña, el cambio total de una tarjeta (sonido, video, SIMMS de memoria, entre otras), o el cambio total de algún dispositivo perif&eac",
        "La periodicidad que se recomienda para darle mantenimiento a la PC es de una vez por semestre, esto quiere decir:",
        "Es necesario mantener el equipo lejos de las ventanas, esto es para evitar que:",
        "Las siguientes siglas CPU hacen referencia a:",
        "¿Cuál es el significado de TIC?",
        "Señala los dispositivos de ENTRADA- PROCESO-SALIDA que corresponden a la estructura anterior, según el flujo de información en un equipo de cómputo:",
    };  
        
       
    
    
    public String getPregunta(int numero){
        return this.pregunta[numero];
    }
    
}
