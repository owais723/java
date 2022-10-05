
package javaapplication1;

import java.util.Scanner;

public class calculatorException {
    public static void main(String args[]){
        int n1,n2;
        System.out.println("enter two numbers");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        calculator c=new calculator();
        c.sub(n1, n2);
        c.add(n1, n2);
        c.mul(n1, n2);
        try{
        c.div(n1, n2);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
class calculator{
    int a, b;
    void add(int a,int b){
        try{
           
            if(a<0 || b<0  )
            throw new ArithmeticException ();
            else{
                 System.out.println("addition:"+(a+b));
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        catch(NumberFormatException e){
            System.out.println(e.toString());
        }
       finally{
            System.out.println("finally executed");
        }
     }
       
    void sub(int a,int b){
        try{
            if(a<0 || b<0)
            throw new ArithmeticException ();
            else{
                 System.out.println("subtraction:"+(a-b));
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
     }
    void mul(int a,int b){
    try{
            if(a==0 || b==0)
            throw new ArithmeticException ();
            else{
                 System.out.println("multiplication:"+(a*b));
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
     }
    void div(int a,int b) throws ArithmeticException{
            System.out.println("division:"+(a/b));
        }
        }
        
