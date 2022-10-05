import static java.lang.Math.*;
import java.util.*;

public class loan {
    public static void main(String a[]){
        float intrest,pp,dp,p,payement,minintrest;
        int nop;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the purchase price");
        pp=s.nextFloat();
        System.out.println("enter the down payement");
        dp=s.nextFloat();
        System.out.println("enter the annual intrest rate");
        intrest=s.nextFloat();
        System.out.println("enter the number of payements");
        nop=s.nextInt();
        p=pp-dp;
        intrest=intrest/100;
        minintrest=intrest/12;
        payement=(float) ((minintrest*p)/(1-pow((1+minintrest),(-nop))));
        System.out.println("ammount borrowed="+p);
        System.out.printf("monthly payement =₹ %.2f",payement);
    }
}
