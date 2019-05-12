/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab05;

/**
 *
 * @author Алексей
 */
public class Auditory {
    public static void main(String[] args) {
        List list = new List();
        list.addFirst(8);
        list.addFirst(4);
        list.addFirst(1);
        list.addLast(8);
        System.out.println("Прямий порядок:");
        list.printList();
        //list.removeLast();
        list.reverseList();
        System.out.println("Обернений порядок:");
        list.printList();
        Element find = list.find(1);
        System.out.printf("%d є в списку\n", find.getData());
        System.out.printf("Довжина списку: %d\n", list.lengthList());
    }
}

class Element{
    private int data;
    public Element next = null;

    public Element(int data, Element next){
        this.data = data;
        this.next = next;
    }

    public Element(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Element getNext(){
        return next;
    }

    public void setNext(Element next){
        this.next = next;
    }

    public Element next(){
        return next != null ? next: null;
    }
}

class List{
    private Element root = null;
    public void addFirst(int data){
        if(root == null){
            root = new Element(data);
        }
        else{
            root = new Element(data, root);
        }
    }

    public void addLast(int data){
        if(root == null){
            addFirst(data);
        }
        else{
            Element element = root;
            while(element.next() != null){
                element = element.next();
            }
            element.setNext(new Element(data));
        }
    }


    public Element find(int data) {
        Element element = root;
        while(element != null && element.getData() != data){
            element = element.next();
        }
        return element;
    }

    public void printList(){
        Element element = root;
        while(element != null){
            System.out.printf(" " + element.getData());
            element = element.next();
        }
        System.out.println();
    }

    public void reverseList()
    {
        Element element = root;
        Element previous = null;
        Element previous1 = null;
        while(element.getNext() != null)
        {
            if(element == root)
            {
                previous = element;
                element = element.getNext();
                previous.setNext(null);
            }
            else
            {
                previous1 = element;
                element = element.getNext();
                previous1.setNext(previous);
                previous = previous1;
            }
        }
        element.setNext(previous);
        root = element;
    }

    public int lengthList(){
        Element element = root;
        int count = 0;
        if(element != null){
            count++;
            while(element != null && element.next() != null){
                count++;
                element = element.next();
            }
        }
        return count;
    }
}
