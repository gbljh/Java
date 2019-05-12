/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab03;

/**
 *
 * @author Алексей
 * Варiант 28, варiантiв 12, тому - варiант 4
 * 1.4. У матриці дійсних чисел NxN знайти максимальний і мінімальний елемент у заданому рядку.
 */
public class Lab03_2 {
    public static void main(String[] args) {
        int n = 5;
        double [][] matrix = new double [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = Math.random() * 10;    
                System.out.print(matrix[i][j] + " ");              
            }
            System.out.println("");
        }
        for(int ch = 0; ch < n; ch++){
            double min = matrix[ch][0];
            double max = matrix[ch][0];
            for(int i = 1; i < n; i++){
                if (matrix[ch][i] < min){
                    min = matrix[ch][i];
                }
                if (matrix[ch][i] > max){
                    max = matrix[ch][i];
                }
            }
            System.out.println("min = "+min+" max = "+max);
            }
    }
}

