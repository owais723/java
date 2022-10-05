import java.util.Scanner;

public class library {
     public static void main(String ar[]){
         int days;
         float fine = 0;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of days the member is late");
         days=s.nextInt();
         if(days>0 && days<=5)
             fine=(float) (0.50*days);
         else if(days>=6 && days<=10)
             fine=1*days;
         else if(days>=10 && days<=30)
             fine=5*days;
         else if(days>30)
             System.out.println("library membership cancelled");
         System.out.println("total fine= Rs. "+fine);
     }
}
