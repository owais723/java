public class fruits {
   void display(){
       System.out.println("display fruits");
   } 
    
}
class apples extends fruits{
    void display(){
       System.out.println("display apples");    
}
}
    class grapes extends apples{
        void display(){
       System.out.println("display grapes");
    }
    }
        class dynamicmethoddispatch{
            public static void main(String a[]){
                
            fruits s=new fruits();
            s.display();
            apples s1=new apples();
            s1.display();
            grapes s2=new grapes();
            s2.display();
            fruits x=new grapes();
            x.display();
            
                
            }
        }
