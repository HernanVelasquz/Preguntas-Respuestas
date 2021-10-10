
package modelo;

public class Respuesta {
    private String[][] resputas = {
        {"A. Windows, Mac Os, Linux - B. Office, Word, Excel - C. Mother Board, Mouse, Teclado - D. Internet, Servidor, Conexión FTP", "A"},
        {"A. Excel- B.  Word - C. Internet - D. Pluma y papel", "B"},
        {"A. Paint - B. Fireworks - C. Photoshop - D. Cualquiera de los 3 anteriores", "D"},
        {"A. Adornar al computador - B. Permiten la entrada como la salida de proceos - C. Permitir el libre acceso al cpu - D. Sirven para que encienda correctamente una computadora","B"},
        {"A. Teclado - B. Maouse - C. Linux - D. Monitor", "D"},
        {"A. Permiten la comunicación entre los usuarios y la computadora - B. Decora el PC  - C. Proporcionan almacenamiento no volátil de datos y memoria. - D.  Permiten conectar a la computadora con otras a través de una interfaz de red.","C"},
        {"A. Proporcionan almacenamiento no volátil de datos y memoria.  - B. Permiten conectar a la computadora con otras a través de una interfaz de red. - C. Windows Live Messenger - D. Permiten la comunicación entre los usuarios y la computadora.", "D"},
        {"A. Es la barra situada en la parte superior de la ventana - B.  Es la barra situada en la parte central de la ventana - C. Es la barra situada en la inferior de la pantalla - D. Es la barra situada en la superior de la pantalla" , "C"},
        {"A. Desplazarnos dentro de la ventana para ver su contenido - B. Mostrar cual es nombre de la ventana - C. Ver los nombres de los menús - D. Conocer la ubicación de las carpetas.", "A"},
        {"A. CTL+ALT+Z - B. ENTER - C. ALT+SHIFT - D. ALT+F4", "D"},
        {"A. Otra página para encontrar información - B. Otro nombre para el URL - C. Un punto de navegación para ir a otra página - D. Una propaganda", "C"},
        {"A. Archivo - B. Inicio - C. Herramientas - D. Edición","A"},
        {"A. =(A1:A33) - B. =SUMA(A1:A33) - C. SUMA(A1:A33) - D. SUMA(A1:A33)", "B"},
        {"A. Reglas - B. Regla vertical - C. Sangria - D. Espaciado", "B"},
        {"A. Estilo - B. Fuentes - C. Tema - D. Formato","C"},
        {"A. Resaltado o negrita - B. Sombreado - C. Cambio de color - D. Borde", "A"},
        {"A. Herramientas de Edición - B. Herramientas de Fuente - C. Herramienta de Formato - D. Herramienta de buscar", "B"},
        {"A. Ventana + R (ejecutar) WINWORD - B. Ventana + R (ejecutar) c:archivos de programamicrosoft officeoffice12winword - C. Inicio> Todos los programas> Microsoft Office> Word 2007 - D. Ninguna Todas estan mal","C"},
        {"A. Word - B. Excel - C. Power Point - Acces", "A"},
        {"A. Mantenimiento preventivo para PCs - B. Mantenimiento correctivo para PCs - C. Limpieza y mantenimiento. - D. Revisión de la instalaciónes eléctricas", "B"},
        {"A. Como mínimo debe dársele tres veces al año - B. Como mínimo debe dársele cuatro veces al año. - C. Como mínimo debe dársele dos veces al año. - D. Ninguna de las anteriores.", "C"},
        {"A. La humedad del aire deteriore el equipo. - B. Los rayos del sol dañen a la PC, así como para evitar que el polvo se acumule con mayor rapidez. - C. Los dispositivos como el router tenga mejor señal. - D. La respuesta B y C son correctas.", "A"},
        {"A. Unidad particular computacional. - B. Procesamiento central de unidades - C. Ninguna de las anteriores. - D. Unidad Central de Proceso", "D"},
        {"A. Tecnologías de la Informática y Computación - B. Tecnologías de la Información y Comunicación - C.  Telecomunicaciones Informadas con la Sociedad - D.  Tecnologías Informáticas Computarizadas", "B"},
        {"A. Monitor--CPU--Teclado - B. Mouse--Teclado--CPU - C. CPU--mouse --Impresora -D. Teclado--CPU—Monitor", "D"}
    };
    
    
    public String obtenerResputa(int numero){
        return this.resputas[numero][0];
    }
    
    public boolean evaluarRespuesta(String respustaSeleccionada, int numberPregunta){
        if( this.resputas[numberPregunta][1] == respustaSeleccionada){
            return true; 
        }else if(respustaSeleccionada != this.resputas[numberPregunta][1]){
            return false;
        }
        return false;
    }
    
}
