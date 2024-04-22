/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author jazzb
 */
public class EVA3_1_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON OBJETOS
        //TENEMOS QUE CREARLOS ANTES DE USARLOS
        //[] --- Manejar los indices: arreglo [3] acceso a la posición
        //delcaracion = creacionc(new) [tamaño del arreglo]
        int arreglo[] = new int [10];//un arreglo de 10 enteros
    //a traves de un indice:
    //conocer las pocisiones de los valores:
    //Primer pocision en java en un arreglo es 0
    //Ultima pocision de un arreglo es--- N-1, donde N es el tamaño del arreglo
    arreglo [1] = 100;
    System.out.println("Valor de arreglo [1] = " + arreglo[1]);
    System.out.println(arreglo);
    System.out.println(arreglo.length);//lenght es la cantidad de elementos
    }
    
}
