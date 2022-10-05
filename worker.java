import java.util.Scanner;

public class worker {
     public static void main(String ar[]){
         float hour;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of hours taken by the worker to complete his job");
         hour=s.nextFloat();
         if(hour>=2 && hour<=3)
             System.out.println("the worker is highly efficient");
         else if(hour>3 && hour<=4)
             System.out.println("the worker needs to improve speed");
         else if(hour>4 && hour<=5)
             System.out.println("give training to worker to improve speed");
         else if(hour>5)
             System.out.println("the worker is terminated");
     }
}
