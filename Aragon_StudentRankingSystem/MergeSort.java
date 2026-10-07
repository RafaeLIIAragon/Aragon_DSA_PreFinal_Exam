/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aragon_StudentRankingSystem;

/**
 *
 * @author User
 */

   
   public class MergeSort {

 
    public static void sort(Student[] students, int left, int right) {

        if (left < right) {

            int middle = (left + right) / 2;

      
            sort(students, left, middle);

         
            sort(students, middle + 1, right);

            merge(students, left, middle, right);
        }
    }

 
    private static void merge(Student[] students, int left, int middle, int right) {

        int leftSize = middle - left + 1;
        int rightSize = right - middle;

      
        Student[] leftArray = new Student[leftSize];
        Student[] rightArray = new Student[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = students[left + i];
        }

        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = students[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

      
        while (i < leftSize && j < rightSize) {

           
            if (leftArray[i].getFinalGrade() >=
                    rightArray[j].getFinalGrade()) {

                students[k] = leftArray[i];
                i++;

            } else {

                students[k] = rightArray[j];
                j++;
            }

            k++;
        }

      
        while (i < leftSize) {
            students[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            students[k] = rightArray[j];
            j++;
            k++;
        }
    }
}



   

