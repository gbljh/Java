/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab03;

import java.util.Random;

/**
 *
 * @author Алексей
 * Варiант 28, варiантiв 14, тому - варiант 14
 * За один прохід визначити одночасно мінімальне та максимальне значення елементів дійсного одновимірного масиву
 */
public class Lab03_1 {
    public static void main(String[] args) {
            Random rnd = new Random();
            double mas[] = new double[10];
            for(int i = 0; i < mas.length; i++){
                mas[i] = rnd.nextDouble();
                System.out.print(mas[i] + " ");
            }
            minmax(mas);
            }
    
    private static void minmax(double[] mas){
        double minmax[] = new double[2];
        minmax[0] = minmax[1] = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i]<minmax[0]){
            minmax[0]= mas[i];
            }
            else if(mas[i]>minmax[1]){
            minmax[1] = mas[i];
            }
        }
        System.out.print("\nmin = "+minmax[0]+" max"+minmax[1]);
    }
}