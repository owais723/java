
import java.util.Scanner;

public interface stack {
    void push(int i);
    void pop();
}
class stackfunctions implements stack{
    int a[]=new int[100];
   static int size;
    int top=-1;
    void getsize(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the stack");
        size=sc.nextInt(); 
    }
    public void push(int item){
        if(top>=size){
            System.out.println("overflow");
        }
        else
        {
            top=top+1;
            a[top]=item;
            System.out.println("item pushed is: "+a[top]);
        }      
    }
    public void pop(){
        if(top<0)
            System.out.println("underflow");
else
{
System.out.println("item popped: "+a[top]);
top=top-1;
    }
}
    public static void main(String x[]){
    int item;
    Scanner sc=new Scanner(System.in);
    stackfunctions s=new stackfunctions();
    s.getsize();
    System.out.println("enter the element to be pushed:");
    item=sc.nextInt();
    s.push(item);
    s.pop();
     stack obj=new stackfunctions();  
     obj.push(item);
    }
}