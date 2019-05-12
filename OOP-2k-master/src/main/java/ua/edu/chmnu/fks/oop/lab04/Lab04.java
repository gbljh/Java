/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab04;

import java.util.Random;

/**
 *
 * @author Алексей
 * Варiант 28, варiантiв 16, тому - варiант 12
 * 12. Дано масив чисел. Реалізуйте алгоритм випадкового перемішування масиву.
 */
public class Lab04 {

    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("До перемешивания");
        show(arr);
        System.out.println("После перемешивания");
        chaos(arr, 0, 9);
        show(arr);
    }
    public static void chaos(int arr[], int i, int j) {
        int temp;
        if ((j-i+1)%2 == 0){
            if(Math.random() < 0.5){
                for(int ii = 0;ii<(j-i)/2;ii++){
                    temp = arr[i+ii];
                    arr[i+ii] = arr[(j-i+1)/2+i+ii];
                    arr[(j-i+1)/2+i+ii] = temp;
                }
            }
            chaos(arr,i,(j-i+1)/2+i-1);
            chaos(arr,(j-i+1)/2+i,j);
        }
        else if(j>i){
            if(Math.random() < 0.5){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                }
            chaos(arr,i,j-1);
            }    
        }
    private static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
