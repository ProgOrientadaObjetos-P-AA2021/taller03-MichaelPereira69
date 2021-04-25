/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg01;

import Paquete1.Terreno;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Terreno terreno1 = new Terreno(); 
        Terreno terreno2 = new Terreno(); 
        terreno1.establecerAncho(300.3);
        terreno1.establecerLargo(200.9);
        terreno1.establecerCostoMetroCuadrado(40);
        terreno1.establecerArea();
        terreno1.establecerCosto();
        terreno2.establecerAncho(6069);
        terreno2.establecerLargo(5069);
        terreno2.establecerCostoMetroCuadrado(30.2);
        terreno2.establecerArea();
        terreno2.establecerCosto();
        System.out.printf("Terreno con la dimencion a lo Largo es: %.2f m\n"
                + "El Ancho es : %.2f m\n"
                + "El area es de: %.2f m2\n"
                + "El m2 tiene un costo de: $%.2f \n"
                + "El costo total del terreno es: $%.2f\n"
                + "El terreno con dimensiones:\n"
                + "Largo: %.2f m\n"
                + "Ancho: %.2f m\n"
                + "Tiene un área de: %.2f m2\n"
                + "El costo del m2 tiene un valor de: $%.2f \n"
                + "El costo total del terreno es: $%.2f\n",
                terreno1.obtenerLargo(),
                terreno1.obtenerAncho(),
                terreno1.obtenerArea(),
                terreno1.obtenerCostoMetroCuadrado(),
                terreno1.obtenerCosto(),
                terreno2.obtenerLargo(),
                terreno2.obtenerAncho(),
                terreno2.obtenerArea(),
                terreno2.obtenerCostoMetroCuadrado(),
                terreno2.obtenerCosto());
    }

}
