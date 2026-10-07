/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aragon_StudentRankingSystem;



/**
 *
 * @author User
 */
public class TestClass {
    public static void main(String[] args) {
    

     
        Student[] students = {
            new Student("S001", "Julve Richard", "BSIT", 91.50),
            new Student("S002", "Andres Caitum", "BSIT", 95.25),
            new Student("S003", "Carias Jerald", "BSIT", 88.75),
            new Student("S004", "Shirra Brigole", "BSIT", 93.00),
            new Student("S005", "Magsayo Kian Jay", "BSIT", 89.50),
            new Student("S006", "Albert Enstein", "BSIT", 97.25),
            new Student("S007", "Kuya Doy", "BSIS", 90.00),
            new Student("S008", "Dape Eden", "BSIT", 94.50)
        };

       
        System.out.println("==============================================");
        System.out.println("        STUDENT LIST BEFORE SORTING");
        System.out.println("==============================================");

        displayStudents(students);

     
        MergeSort.sort(students, 0, students.length - 1);

      
        System.out.println();
        System.out.println("==============================================");
        System.out.println("        STUDENT LIST AFTER MERGE SORT");
        System.out.println("==============================================");

        displayStudents(students);

      
        System.out.println();
        System.out.println("==============================================");
        System.out.println("              TOP 3 STUDENTS");
        System.out.println("==============================================");

        for (int i = 0; i < 3; i++) {

            System.out.printf("%d. %s (%s) - %s - Grade: %.2f%n",
                    i + 1,
                    students[i].getName(),
                    students[i].getStudentId(),
                    students[i].getProgram(),
                    students[i].getFinalGrade());
        }
    }


    public static void displayStudents(Student[] students) {

        System.out.printf("%-10s %-20s %-15s %-12s%n",
                "ID", "Name", "Program", "Final Grade");

        System.out.println("------------------------------------------------------------");

        for (Student student : students) {
            student.displayStudent();
        }
    }
}

   
   

