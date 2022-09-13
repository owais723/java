
public interface Fruits1 {
    void display();
}
class apples implements Fruits1{
    public void display(){
       System.out.println("display apples");    
}
    
}
class grapes implements Fruits1{
    public void display(){
       System.out.println("display grapes");    
}
    
}
class intrabs{
            public static void main(String a[]){
                
            fruits s=new fruits();
            s.display();
            apples s1=new apples();
            s1.display();
            grapes s2=new grapes();
            s2.display();
            Fruits1 x=new grapes();
            x.display();
            
                
            }
        }