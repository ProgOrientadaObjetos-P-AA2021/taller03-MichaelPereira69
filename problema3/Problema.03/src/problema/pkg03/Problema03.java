/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg03;
import Paquete01.InstitucionesEducativas;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          InstitucionesEducativas institucion1 = new InstitucionesEducativas(); 
        InstitucionesEducativas institucion2 = new InstitucionesEducativas();
        InstitucionesEducativas institucion3= new InstitucionesEducativas();
        institucion1.establecerNombre("Colegio Particular Dr. José María Vivar Castro");
        institucion1.establecerTipoInstitucion("Particular");
        institucion1.establecerNumeroAlumno(200);
        institucion1.establecerNumeroDocente(6);
        institucion1.establecerNumeroSede(1);
        institucion2.establecerNombre("Unidad EducativaMarieta de Veintimilla");
        institucion2.establecerTipoInstitucion("Fiscomisional");
        institucion2.establecerNumeroAlumno(700);
        institucion2.establecerNumeroDocente(30);
        institucion2.establecerNumeroSede(1);
        institucion3.establecerNombre("Colegio de Bachillerato Beatriz Cueva de Ayora ");
        institucion3.establecerTipoInstitucion("Fiscomisional");
        institucion3.establecerNumeroAlumno(10000);
        institucion3.establecerNumeroDocente(40);
        institucion3.establecerNumeroSede(2);
        System.out.printf("Instituciónes:\n"
                + "Nombre de la Institucion: %s\n"
                + "Es de tipo: %s\n"
                + "El numero de estudiantes son: %d\n"
                + "El numero de Docentes es de: %d\n"
                + "Numero de Sedes es de: %d\n\n"
                + "Instituciónes:\n"
                + "Nombre de la intitucion es: %s\n"
                + "Es de Tipo: %s\n"
                + "El nmuero de Alumnos es de: %d\n"
                + "El numero de Docentes es de: %d\n\n"
                + "Numero de Sedes es de: %d\n"
                + "Nombre de la intitucion es: %s\n"
                + "Es de Tipo: %s\n"
                + "El nmuero de Alumnos es de: %d\n"
                + "El numero de Docentes es de: %d\n\n"
                + "Numero de Sedes es de: %d\n",
                institucion1.obtenerNombre(),
                institucion1.obtenerTipoInstitucion(),
                institucion1.obtenerNumeroAlumnos(),
                institucion1.obtenerNumeroDocentes(),
                institucion1.obtenerNumeroSede(),
                institucion2.obtenerNombre(),
                institucion2.obtenerTipoInstitucion(),
                institucion2.obtenerNumeroAlumnos(),
                institucion2.obtenerNumeroDocentes(),
                institucion2.obtenerNumeroSede(),
                institucion3.obtenerNombre(),
                institucion3.obtenerTipoInstitucion(),
                institucion3.obtenerNumeroAlumnos(),
                institucion3.obtenerNumeroDocentes(),
                institucion3.obtenerNumeroSede());
        
    
    }

}
