import java.util.*;

public class leapYear {
public static void main(String ar[]){
    int year;
    Scanner s=new Scanner(System.in);
    System.out.println("enter any year:");
    year=s.nextInt();
    if(year%4==0 &&year/100!=0 || year%400==0)
     System.out.println(year+" is a leap year");
    else
     System.out.println(year+" is not a leap year");
  }    
}
