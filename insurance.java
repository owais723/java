import java.util.Scanner;

public class insurance {
    public static void main(String ar[]){
         int age;
         char sex,health,area;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the health of a person:");
         health=s.next().charAt(0);
         System.out.println("enter the sex of a person:");
         sex=s.next().charAt(0);
         System.out.println("enter the area from where the person is:");
         area=s.next().charAt(0);
         System.out.println("enter the age of a person:");
         age=s.nextInt();
         if(health=='e' && sex=='m' && area=='c' && age>=25 && age<=35)
             System.out.println("person is insured. \nHis premium rate=Rs.4 per 1000 \nmaximum policy ammount= Rs.2 lakh.");
         else if(health=='e' && sex=='f' && area=='c' && age>=25 && age<=35)
             System.out.println("person is insured. \nHis premium rate=Rs.3 per 1000 \nmaximum policy ammount=Rs.1 lakh.");
         else if(health=='p' && sex=='m' && area=='v' && age>=25 && age<=35)
             System.out.println("person is insured. \nHis premium rate= Rs.6 per 1000\nmaximum policy ammount= Rs.10,000.");
         else 
           System.out.println("the person is not insured");
    }
}
