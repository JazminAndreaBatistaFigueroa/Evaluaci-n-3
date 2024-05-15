/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperaturas;

/**
 *
 * @author jazzb
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celsius = 25;
        System.out.println("Celsius a Fahrenheit: " + celsiusAFahrenheit(celsius));
        System.out.println("Fahrenheit a Kelvin: " + celsiusAKelvin(celsius));
        
         double fahrenheit = 25;
        System.out.println("Fahrenheit a Celsius: " + fahrenheitACelsius(fahrenheit));
        System.out.println("Fahrenheit a Kelvin: " + fahrenheitAKelvin(fahrenheit));
        
        double kelvin = 298;
        System.out.println("Kelvin a Fahrenheit: " + kelvinAFahrenheit(kelvin));
    }
    //converir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
     public static double celsiusAKelvin(double celsius){
        return celsius + 273.15;
}
     public static double fahrenheitACelsius (double fahrenheit) {
         return (fahrenheit - 32) * 5 / 9;
     }
         public static double kelvinAFahrenheit (double kelvin) {
         return (kelvin - 273.15) * 9 / 5 + 32;
    }
    public static double fahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
        
    }
