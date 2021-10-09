
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Pregunta {
//    private ArrayList<String> preguntas;
    private String[] preguntas = {
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
    
    private String[] listResputas = {
        "A. Windows, Mac Os, Linux - B. Office, Word, Excel - C. Mother Board, Mouse, Teclado - D. Internet, Servidor, Conexión FTP",
        "A. Excel- B.  Word - C. Internet - D. Pluma y papel",
        "A. Paint - B. Fireworks - C. Photoshop - D. Cualquiera de los 3 anteriores",
        "A. Adornar al computador - B. Permiten la entrada como la salida de proceos - C. Permitir el libre acceso al cpu - D. Sirven para que encienda correctamente una computadora",
        "A. Teclado - B. Maouse - C. Linux - D. Monitor ",
        "A. Permiten la comunicación entre los usuarios y la computadora - B. Decora el PC  - C. Proporcionan almacenamiento no volátil de datos y memoria. - D.  Permiten conectar a la computadora con otras a través de una interfaz de red.",
        "A. Proporcionan almacenamiento no volátil de datos y memoria.  - B. Permiten conectar a la computadora con otras a través de una interfaz de red. - C. Windows Live Messenger - D. Permiten la comunicación entre los usuarios y la computadora.",
        "A. Es la barra situada en la parte superior de la ventana - B.  Es la barra situada en la parte central de la ventana - C. Es la barra situada en la inferior de la pantalla - D. Es la barra situada en la superior de la pantalla",
        "A. Desplazarnos dentro de la ventana para ver su contenido - B. Mostrar cual es nombre de la ventana - C. Ver los nombres de los menús - D. Conocer la ubicación de las carpetas.",
        "A. CTL+ALT+Z - B. ENTER - C. ALT+SHIFT - D. ALT+F4",
        "A. Otra página para encontrar información - B. Otro nombre para el URL - C. Un punto de navegación para ir a otra página - D. Una propaganda",
        "A. Archivo - B. Inicio - C. Herramientas - D. Edición",
        "A. =(A1:A33) - B. =SUMA(A1:A33) - C. SUMA(A1:A33) - D. SUMA(A1:A33)",
        "A. Reglas - B. Regla vertical - C. Sangria - D. Espaciado",
        "A. Estilo - B. Fuentes - C. Tema - D. Formato",
        "A. Resaltado o negrita - B. Sombreado - C. Cambio de color - D. Borde",
        "A. Herramientas de Edición - B. Herramientas de Fuente - C. Herramienta de Formato - D. Herramienta de buscar",
        "A. Ventana + R (ejecutar) WINWORD - B. Ventana + R (ejecutar) c:archivos de programamicrosoft officeoffice12winword - C. Inicio> Todos los programas> Microsoft Office> Word 2007 - D. Ninguna Todas estan mal",
        "A. Word - B. Excel - C. Power Point - Acces",
        "A. Mantenimiento preventivo para PCs - B. Mantenimiento correctivo para PCs - C. Limpieza y mantenimiento. - D. Revisión de la instalaciónes eléctricas",
        "A. Como mínimo debe dársele tres veces al año - B. Como mínimo debe dársele cuatro veces al año. - C. Como mínimo debe dársele dos veces al año. - D. Ninguna de las anteriores.",
        "A. La humedad del aire deteriore el equipo. - B. Los rayos del sol dañen a la PC, así como para evitar que el polvo se acumule con mayor rapidez. - C. Los dispositivos como el router tenga mejor señal. - D. La respuesta B y C son correctas.",
        "A. Unidad particular computacional. - B. Procesamiento central de unidades - C. Ninguna de las anteriores. - D. Unidad Central de Proceso",
        "A. Tecnologías de la Informática y Computación - B. Tecnologías de la Información y Comunicación - C.  Telecomunicaciones Informadas con la Sociedad - D.  Tecnologías Informáticas Computarizadas",
        "A. Monitor--CPU--Teclado - B. Mouse--Teclado--CPU - C. CPU--mouse --Impresora -D. Teclado--CPU—Monitor"
    };
    
    
    
    
    
    
//    public ArrayList<String> getPregunta() {
//        return preguntas;
//    }
//
//    public void setPregunta(ArrayList<String> pregunta) {
//        this.preguntas = pregunta;
//    }
//
//     public ArrayList<String> reedFilePregunta(){
//        
//        try {
//            FileReader txtPreguntas = new FileReader("D:\\GitHub\\Preguntas-Respuestas\\src\\preguntas\\nivel-\\preguntas.txt");
//            BufferedReader leer = new BufferedReader(txtPreguntas);
//            String cadena;
//            while((cadena = leer.readLine()) != null){
//                this.preguntas.add(cadena);
//            }
//        } catch (Exception e) {
//            
//        }
//        
//        return this.preguntas;
//    }
}
