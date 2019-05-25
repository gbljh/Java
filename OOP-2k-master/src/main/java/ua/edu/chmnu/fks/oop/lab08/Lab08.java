/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab08;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Алексей
 * У списку рядків визначити, які з них є «паліндромами»
 */

public class Lab08 {
    public static void main(String[] args) {
        String first = "Murder for a jar of red rum";
        String second = "I hurt myself today to see if I steel feel";
        System.out.println(first);
        System.out.println(Palindrome(first));
        System.out.println(second);
        System.out.println(Palindrome(second));
    }
    static public boolean Palindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\\s+","");
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}

