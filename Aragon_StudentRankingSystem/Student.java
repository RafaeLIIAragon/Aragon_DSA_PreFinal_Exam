/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aragon_StudentRankingSystem;

/**
 *
 * @author User
 */
public class Student{
    
  

    private String id;
    private String name;
    private String program;
    private double finalGrade;

    // Constructor
    public Student(String studentId, String name, String program, double finalGrade) {
        this.id = studentId;
        this.name = name;
        this.program = program;
        this.finalGrade = finalGrade;
    }

    // Getters
    public String getStudentId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    // Display student information
    public void displayStudent() {
        System.out.printf("%-10s %-20s %-15s %.2f%n",
                id, name, program, finalGrade);
    }
}


    
    
