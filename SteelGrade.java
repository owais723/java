import java.util.Scanner;

public class SteelGrade {
  public static void main(String ar[]){
     float hard,ts,cc;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the hardness, carbon content and tensile strength of of the steel");
     hard=s.nextFloat();
     cc=s.nextFloat();
     ts=s.nextFloat();
     if(hard>50 && cc<0.7 && ts>5600)
         System.out.println("grade of steel is 10");
     else if(hard>50 && cc<0.7 && !(ts>5600))
         System.out.println("grade of steel is 9");
     else if(!(hard>50) && cc<0.7 && ts>5600)
         System.out.println("grade of steel is 8");
     else if(hard>50 && !(cc<0.7) && ts>5600)
         System.out.println("grade of steel is 7");
    else if(hard>50 || cc<0.7 || ts>5600 )
         System.out.println("grade of steel is 6");
    else if(!(hard>50) && !(cc<0.7) && !(cc>5600))
         System.out.println("grade of steel is 5");
}
}
