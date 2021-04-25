/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;
import Paquete01.EquivalenteHora;
/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquivalenteHora horaUno = new EquivalenteHora();
        EquivalenteHora horaDos = new EquivalenteHora();
        horaUno.establecerHora(100);
        horaUno.establecerMinuto();
        horaUno.establecerSegundo();
        horaUno.establecerDia();
        horaDos.establecerHora(200);
        horaDos.establecerMinuto();
        horaDos.establecerSegundo();
        horaDos.establecerDia();
        System.out.printf("las %d horas son equivalentes  a:\n"
                + "%d minutos\n"
                + "%d segundos\n"
                + "%.2f horas\n"
                + "Las %d horas son equivalentes a:\n"
                + "%d minutos\n"
                + "%d segundos\n"
                + "%.2f horas\n",
                horaUno.obtenerHora(),
                horaUno.obtenerMinuto(),
                horaUno.obtenerSegundo(),
                horaUno.obtenerDia(),
                horaDos.obtenerHora(),
                horaDos.obtenerMinuto(),
                horaDos.obtenerSegundo(),
                horaDos.obtenerDia());
    }

}