/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab06;

/**
 *
 * @author �������
 * ���i��� 28, ���i���i� 12, ���� - ���i��� 4
 * 12. �������� ������� ���� ������. �������� ������ ����� �ϳ�������, ��������, ������� ����� ����. ������ �������������� ����� � �����, ����� (�), �� ������� ����.
 */
public class Lab06 {

    static public void main(String[] args) {
        Pidrucnik pidrucnik = new Pidrucnik(
                "��������� ����",
                "����",
                2008,
                500,
                208
        );
        Posibnik posibnik = new Posibnik(
                "Java",
                "��������",
                2019,
                100,
                300
        );
        Zbirnik_tvoriv zbirnik_tvoriv = new Zbirnik_tvoriv(
                "�i��i�",
                "���",
                -4000,
                0,
                1488
        );
        Roman roman = new Roman(
                "�������",
                "����� ������",
                1985,
                200,
                333
        );
        System.out.printf(pidrucnik.toString());
        System.out.printf(posibnik.toString());
        System.out.printf(zbirnik_tvoriv.toString());
        System.out.printf(roman.toString());
    }

    static abstract class Book{
        private String name;
        private String author;
        private int year;
        private int price;
        private int pages;

        public Book(String name, String author, int year, int price, int pages){
            this.name = name;
            this.author = author;
            this.year = year;
            this.price = price;
            this.pages = pages;
        }

        public abstract String getBookType();

        public String getName(){
            return name;
        }

        public String getAuthor(){
            return author;
        }

        public int getYear(){
            return year;
        }

        public int getPrice(){
            return  price;
        }
        
        public int getPages(){
            return  pages;
        }
        
        public void setName(String name){
            this.name = name;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public void setYear(int year){
            this.year = year;
        }

        public void setPrice(int price){
            this.price = price;
        }
        
        public int setPages(){
            return  pages;
        }
    }

    static class Pidrucnik extends Book{
        private String bookType = "�i�������";

        public Pidrucnik (String name, String author, int year, int price, int pages) {
            super(name, author, year, price, pages);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "���: " + bookType + '\n' +
                    "�����: " + getName() + '\n' +
                    "�����: " + getAuthor() + '\n' +
                    "�i�: " + getYear() + '\n' +
                    "�-��� ����i���: " + getPages() + '\n' +
                    "�i��(���): " + getPrice() + '\n';
        }
    }
    
    static class Posibnik extends Book{
        private String bookType = "���i����";

        public Posibnik (String name, String author, int year, int price, int pages) {
            super(name, author, year, price, pages);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "���: " + bookType + '\n' +
                    "�����: " + getName() + '\n' +
                    "�����: " + getAuthor() + '\n' +
                    "�i�: " + getYear() + '\n' +
                    "�-��� ����i���: " + getPages() + '\n' +
                    "�i��(���): " + getPrice() + '\n';
        }
    }
    
    static class Zbirnik_tvoriv extends Book{
        private String bookType = "��i���� ����i�";

        public Zbirnik_tvoriv (String name, String author, int year, int price, int pages) {
            super(name, author, year, price, pages);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "���: " + bookType + '\n' +
                    "�����: " + getName() + '\n' +
                    "�����: " + getAuthor() + '\n' +
                    "�i�: " + getYear() + '\n' +
                    "�-��� ����i���: " + getPages() + '\n' +
                    "�i��(���): " + getPrice() + '\n';
        }
    }
    
    static class Roman extends Book{
        private String bookType = "�����";

        public Roman (String name, String author, int year, int price, int pages) {
            super(name, author, year, price, pages);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "���: " + bookType + '\n' +
                    "�����: " + getName() + '\n' +
                    "�����: " + getAuthor() + '\n' +
                    "�i�: " + getYear() + '\n' +
                    "�-��� ����i���: " + getPages() + '\n' +
                    "�i��(���): " + getPrice() + '\n';
        }
    }
}
