/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab03;

/**
 *
 * @author Алексей
 * Сортування вставками
 */
public class Auditory {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 8, 2, 2, 8};
        int temp;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            int j = i - 1;
            while( j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf(" " + arr[i]);
        }
    }
}
