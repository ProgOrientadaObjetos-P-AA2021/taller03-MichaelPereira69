/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete01;

/**
 *
 * @author USUARIO
 */
public class InstitucionesEducativas {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerTipoInstitucion(String t) {
        tipoInstitucion = t;
    }
    public void establecerNumeroAlumno(int a) {
        numeroAlumnos = a;
    }
    public void establecerNumeroDocente(int d) {
        numeroDocentes = d;
    }
    public void establecerNumeroSede(int n) {
        numeroSedes = n;
    }

    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }
    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }
    public int obtenerNumeroSede() {
        return numeroSedes;
    }
}