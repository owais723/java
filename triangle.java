import static java.lang.Math.pow;
import java.util.Scanner;

public class triangle{
    public static void main(String ar[]){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the sides of triangle");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt(); 
        if(a==b && a==c)
            System.out.println("it is an equilateral triangle");
        else if(a==b || b==c || c==a)
             System.out.println("it is an isoceles triangle");
        else if(a!=b && b!=c && c!=a)
             System.out.println("it is a scalene triangle");
         if(pow(a,2)==(pow(b,2)+pow(c,2)) || pow(b,2)==(pow(c,2)+pow(a,2))||pow(c,2)==(pow(b,2)+pow(a,2)))
             System.out.println("it is a right angled triangle");
       
    }
}
