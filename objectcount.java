/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author owais
 */
public class objectcount {
    static int count=0;
    public static void main(String a[])
    {
        objectcount c1=new objectcount();
        c1.count();
        objectcount c2=new objectcount();
        c2.count();
        objectcount c3=new objectcount();
        c3.count();
        System.out.println("number of instances are:"+count);
    }
    static void count()
    {
        count++;
    }
}

