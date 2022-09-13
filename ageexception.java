import java.util.Scanner;

class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();
  
  try {
   if(age < 0) 
    throw new AgeException("Invalid age");
   else
    System.out.println("Valid age");
            
        
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}
public class ageexception {

 public static void main(String[] args) {
  
  AgeException obj=new AgeException(a);
  
 }
}