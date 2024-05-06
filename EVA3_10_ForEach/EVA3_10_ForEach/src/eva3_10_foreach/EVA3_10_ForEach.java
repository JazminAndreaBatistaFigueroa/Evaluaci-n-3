/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_foreach;

/**
 *
 * @author jazzb
 */
public class EVA3_10_ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String diasSemana[] = {"Domingo", "Lunes", "Martes","Miercoles", "Jueves", "Viernes", "Sabado"};
         
         for (String dia : diasSemana) {
             System.out.println(dia);
            
        }
         int salario[] = {50, 1000, 2500, 6643, 55646, 10000};
         for(int cant: salario)
             System.out.println("$" + cant);
         //--------------------------
         
       //Meses del año. Imprimir con For Each
       String mesesAño[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
       
        for (String mes : mesesAño) {
            System.out.println(mes);
            
        }
        
    }
    
}
