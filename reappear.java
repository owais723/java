import java.util.Scanner;

public class reappear {

  
    public static void main(String[] args) {
        int A, B;
	System.out.println("enter the mark in subject A : B ");
	 Scanner sc = new Scanner(System.in);
	 A= sc.nextInt();
         B= sc.nextInt();
	if (A >= 55 && B >= 45)
	{
		System.out.println("STUDENT QUALIFY FOR DEEGRY ");
	}
	else if (A >= 45 && B >= 55)
	{
		System.out.println("STUDENT QUALIFY FOR DEEGRY ");
	}
	else if (A >= 65 && B < 45)
	{
		System.out.println("student reapear to qualify exam B");
	}
	else
		System.out.println("student is fail");
    }
    
}
