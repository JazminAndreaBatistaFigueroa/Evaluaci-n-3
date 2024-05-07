/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1:");
        int val1 = captu.nextInt();
         System.out.println("Valor 2:");
        int val2 = captu.nextInt();
        //Llamar la funcion
        //1.Guardar el resultado:
        //Muchas veces.
        int resu = sumar(val1, val2);
        System.out.println("La suma = " + resu);
        //Usar directamente el resultado de la funcion
        //cuando solo se usa el resultado una vez
       
       System.out.println("La suma = " + sumar(val1, val2));
       sumar(val1, val2);
    }
    
    public static int sumar (int num1, int num2){
      int resu = num1 + num2;
      return resu;//Es la ultima instruccion del metodo 
                  //depsues de return no puede haber mas instrucciones

}
    }
