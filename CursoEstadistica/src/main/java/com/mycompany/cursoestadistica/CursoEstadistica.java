/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
license
*/
package com.mycompany.cursoestadistica;
import java.util.Scanner;
import java.util.ArrayList;
/**
*
* @author labctr
*/
public class CursoEstadistica {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Estudiante> listaAlumnos = new ArrayList<>();

    System.out.println("ESTADISTICA DE UNA CLASE");
    System.out.print("Escriba en nombre del curso: ");
    String nombre=scanner.next();
    System.out.print("Escriba el numero de estudiantes: ");
    int n = scanner.nextInt();

    for(int i=0;i<n;i++){
    Estudiante estudiante= new Estudiante();
    System.out.println(" ");
    System.out.println("_____________________");
    System.out.println("Estudiante # "+(i+1));
    System.out.print("Semestre: ");
    int semestre = scanner.nextInt();
    estudiante.setSemestre(semestre);
    System.out.print("Nota: ");
    float nota = scanner.nextFloat();
    estudiante.setNota(nota);

    listaAlumnos.add(estudiante);
    }
    Curso curso = new Curso(listaAlumnos);
    float notaPromedio = curso.notaProm();
    System.out.println("La nota promedio de la clase es: " + notaPromedio);
    }
}
