/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab05;

/**
 *
 * @author Алексей
 * Варiант 28, варiантiв 16, тому - варiант 12
 * 12. Клас прямої на площині. Реалізувати методи, які обчислюють її канонічні форми, точки перетину з іншою прямою.
 */
public class Lab05 {
    public static void main(String[] args){
       Point a = new Point(1, 2);
       Point b = new Point(3, 4);
       Point c = new Point(1, 10);
       Point d = new Point(2, 30);
       Direct d1 = new Direct(a,b);
       d1.printformula(d1);
       Direct d2 = new Direct(c,d);
       d2.printformula(d2);
       Point e = d1.cross(d1, d2);
       if (e != null){
       System.out.println("x = "+e.x+" y = "+e.y);
       }
    }
}

class Point {
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

class Direct {
    double A, B, C;
    
    Direct(Point a, Point b){
        A = A(a, b);
        B = B(a, b);
        C = C(a, b);
    }
    
    public double A(Point a, Point b){
        return a.y-b.y;
    }
    
    public double B(Point a, Point b){
        return b.x-a.x;
    }
    
    public double C(Point a, Point b){
        return a.x*b.y-b.x*a.y;
    }
    
    public void printformula(Direct d){
        System.out.println(A+"x + "+B+"y + "+C+" = 0");
    }
    
    public Point cross(Direct d1, Direct d2){
        double x = (d2.C/d2.B-d1.C/d1.B)/(d1.A/d1.B-d2.A/d2.B);
        if ((-d1.A*x-d1.C)/d1.B != (-d2.A*x-d2.C)/d2.B){
            System.out.println("Прямi не паралельнi");
            return new Point(x, (-d1.A*x-d1.C)/d1.B);
        }
        else{
            System.out.println("Прямi паралельнi");
            return null;
        }
    }
}

