/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg04;
import Paquete01.DispositivosDeUnCelular;
/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           DispositivosDeUnCelular celuUno = new DispositivosDeUnCelular();
        DispositivosDeUnCelular celuDos = new DispositivosDeUnCelular(); 
        DispositivosDeUnCelular celuTres = new DispositivosDeUnCelular(); 

        celuUno.establecerSistemaOperativo("Android");
        celuUno.establecerTamanoPantalla(20);
        celuUno.establecerCosto(150.00);
        celuUno.establecerDireccionMac("14:96:E5:FA:30:57");
        celuUno.establecerInformacionImei("351758103721989");
        
        celuDos.establecerSistemaOperativo("IOS");
        celuDos.establecerTamanoPantalla(30);
        celuDos.establecerCosto(350.00);
        celuDos.establecerDireccionMac("F6:H8:W5.J6:Y9");
        celuDos.establecerInformacionImei("5349768g157635");
        
        celuTres.establecerSistemaOperativo("Android");
        celuTres.establecerTamanoPantalla(45);
        celuTres.establecerCosto(500.00);
        celuTres.establecerDireccionMac("13:85:FA:98:A0:62");
        celuTres.establecerInformacionImei("458768934586871");
       
        System.out.printf("El dispositivo tiene las siguientes caracteristicas:\n"
                + ">>Un sistema operativo de: %s\n"
                + ">>El tamaño de la pantalla es de: %d\n"
                + ">>Con un costo de: $%.2f\n"
                + ">>Dirección MAC: %s\n"
                + ">>Información IMEI: %s\n\n"
                + "El dispositivo tiene las siguientes caracteristicas:\n"
                + ">>Un sistema operativo de: %s\n"
                + ">>El tamaño de lapantalla es de: %d\n"
                + ">>Con un costo de: $%.2f\n"
                + ">>Dirección MAC: %s\n"
                + ">>Información IMEI: %s\n\n"
                + "El dispositivo tiene las siguientes caracteristicas:\n"
                + ">>Un sistema operativo de: %s\n"
                + ">>El tamaño de lapantalla es de: %d\n"
                + ">>Con un costo de: $%.2f\n"
                + ">>Dirección MAC: %s\n"
                + ">>Información IMEI: %s\n\n",
                celuUno.obtenerSistemaOperativo(),
                celuUno.obtenerTamanoPantalla(),
                celuUno.obtenerCosto(),
                celuUno.obtenerDireccionMac(),
                celuUno.obtenerInformacionImei(),
                
                celuDos.obtenerSistemaOperativo(),
                celuDos.obtenerTamanoPantalla(),
                celuDos.obtenerCosto(),
                celuDos.obtenerDireccionMac(),
                celuDos.obtenerInformacionImei(),
                
                celuTres.obtenerSistemaOperativo(),
                celuTres.obtenerTamanoPantalla(),
                celuTres.obtenerCosto(),
                celuTres.obtenerDireccionMac(),
                celuTres.obtenerInformacionImei());

    }

}