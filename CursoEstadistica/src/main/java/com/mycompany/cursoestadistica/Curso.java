/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursoestadistica;
import java.util.ArrayList;
/**
*
* @author labctr
*/
public class Curso {
    private final ArrayList<Estudiante> listaEstudiantes;
    //private String nombre;
    //private int cantidadEst;
    private float notaProm;
    // private int ganadores;
    // private int perdedores;
    // private int semestreProm;
 public Curso(ArrayList<Estudiante> listaEstudiantes){
    this.listaEstudiantes = listaEstudiantes;
    }
 public float notaProm(){
    float sumaNotas=0;
    for (Estudiante estudiante : listaEstudiantes) {
    sumaNotas += estudiante.getNota();
        }
    return sumaNotas;
    }
}
