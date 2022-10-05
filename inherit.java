
package javaapplication1;
import java.util.Scanner;


public class inherit {
    
}
class person{
    int name,contactno;
    string adress;
    
}
class employee extends person{
    float bsalary;
    int empid;
    float grosssalary;
    void getsalary(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter basic salary");
        bsalary=sc.nextFloat();     
    }
    int calgross(){
        float da=(float) (bsalary*0.05);
        float hra=(float) (bsalary*0.1);
        grosssalary=(int) (bsalary+da+hra);
        return (int) grosssalary;
    }
    void disp(){
        System.out.println("gross salary is:"+grosssalary);
        
    }
    class student(){
        int rollno,batch,marks;
        int perc;
    }
    void getrollno()
            
}
