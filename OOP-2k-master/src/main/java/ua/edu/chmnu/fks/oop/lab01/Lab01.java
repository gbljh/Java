/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab01;

import java.util.Scanner;

/**
 *
 * @author �������
 */
public class Lab01 {
    static public void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("������� 2 �����: ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("%d+%d=%d\n", a, b, a + b);
        } catch (Exception e) {
            System.out.println("�������� ������");
        }
    }
}
