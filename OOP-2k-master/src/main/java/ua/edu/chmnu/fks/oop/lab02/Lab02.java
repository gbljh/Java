/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1710528
 * Варiант 28, варiантiв 25, тому - варiант 3
 */
public class Lab02 {
    public static void main(String[] args) {
        double a, b, c, x, y;
        boolean att = true;
        while (att == true){
        System.out.println("1. Розрахувати функцію з заданими параметрами");
        System.out.println("2. Розрахувати функцію з випадковими параметрами");
        System.out.println("3. Розрахувати функцію з Вашими параметрами");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        switch(s){
            case "1":
                a = -3;
                b = 4;
                c = 1.2;
                x = 0.5;
                System.out.println("a  = " + a + " b  = " + b + " c  = " + c + " x  = " + x);
                y = f(a, b, c, x);
                System.out.println("y = " + y);
                att = false;
            break;
            case "2":
                Random rnd = new Random();
                a = rnd.nextDouble();
                c = rnd.nextDouble();
                b = rnd.nextDouble();
                x = rnd.nextDouble();
                while(c == 0 || c+x == 0 || Math.pow(2.718,(x+b)/c) == 0){
                    b = rnd.nextDouble();
                    c = rnd.nextDouble();
                    x = rnd.nextDouble();
                }
                System.out.println("a  = " + a + " b  = " + b + " c  = " + c + " x  = " + x);
                y = f(a, b, c, x);
                System.out.println("y = " + y);
                att = false;
            break;
            case "3":
                System.out.print("Введiть a:");
                a = in.nextDouble();
                System.out.print("Введiть c:");
                c = in.nextDouble();
                System.out.print("Введiть b:");
                b = in.nextDouble();
                System.out.print("Введiть x:");
                x = in.nextDouble();
                while(c == 0 || c+x == 0 || Math.pow(2.718,(x+b)/c) == 0){
                    System.out.print("Введiть c:");
                    c = in.nextDouble();
                    System.out.print("Введiть b:");
                    b = in.nextDouble();
                    System.out.print("Введiть x:");
                    x = in.nextDouble();
                }
                System.out.println("a  = " + a + " b  = " + b + " c  = " + c + " x  = " + x);
                y = f(a, b, c, x);
                System.out.println("y = " + y);
                att = false;
            break;
        }
        
    }
    }
    public static double f(double a, double b, double c, double x){
        return Math.pow(2.718,Math.pow((a*Math.pow(x,2)-b)/c+x,1/3))+Math.cos(a*x)/Math.pow(2.718,(x+b)/c);
    }
}
 /*
    static double function(double a, double b, double x){
        double answer = (Math.pow(a*Math.pow(x,3)+3, 1/7))/(Math.pow(2.7,b)-Math.abs(6*Math.log(3*x)));
        return answer;
    }
}*/