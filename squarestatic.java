/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;


public class squarestatic {
    static int num;
    static void sqo()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
       num=sc.nextInt();
       
       num=num*num;
       System.out.println("square of number number is:"+num);
       
    }
    public static void main(String a[])
    {
      squarestatic c=new squarestatic();
      c.sqo();
        
    }
    
}
