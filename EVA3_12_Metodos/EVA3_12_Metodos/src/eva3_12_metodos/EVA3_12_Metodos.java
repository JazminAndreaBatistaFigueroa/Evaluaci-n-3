/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author jazzb
 */
public class EVA3_12_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Invocar el metodo -- llamar al metodo--- call
        mostrarMensaje("Hola mundo cruel!!");
        mostrarMuchosMensajes("HOLA!!", 6);
    }
    //public static --- para la materia Poo
    //void--- (tipo de dato) valor que regresa el metodo
    //void--- np regresa nada
    //nombre del metodo ---- identificador valido
    //                       empezar en miniusculas, debe ser un verbo
    //() ---- parametros del metodo (argumentos)--- valores que ncesita el metodo para funcionar
    public static void mostrarMensaje(String mensaje){ //Encabezado (nombre del metodo)
        //cuerpo del metodo: aqui va nuestro codigo
    System.out.println(mensaje);
}
    
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
            }
    
    }
