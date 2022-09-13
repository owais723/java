/*write a program for linear and binary seraching
 */
package javaapplication1;

import java.util.Scanner;
public class Search {
    public static void main(String ar[]){
        int arr[]=new int[20];
        int i,n,item;
        Scanner s=new Scanner(System.in);
        linBin obj=new linBin();
        System.out.println("Enter the size of an array");
        n=s.nextInt();
        System.out.println("Enter the elements of an array");
         for(i=0;i<n;i++){
         arr[i]=s.nextInt();
         }
         System.out.println("Enter the element to be searched:");
         item=s.nextInt();
    
         int index= obj.linear(arr,item);
         if(index!=-1){
             System.out.println("using linear search:");
             System.out.println(item+" is found at index: "+index); 
          }
         else 
         System.out.println("Item not found:");
         obj.binary(arr,0,n-1,item);
    }
}
class linBin{
    int i;
    int linear(int arr[],int key){
      
      for(i=0;i<arr.length;i++){
          if(arr[i]==key)
              return i;
      }
      return -1;
  }
    int binary(int arr[],int first,int last,int item){
       int mid = (first + last)/2;  
        
       if ( arr[mid] < item ) { 
        return binary(arr,mid+1,last,item);
         }
       else if(arr[mid]>item){ 
         return binary(arr,first,mid-1,item);
         }  
       else if ( arr[mid] == item ){
           System.out.println("using binary search:");
           System.out.println("Element is found at index: " + mid);
        }  
        if ( first > last ){  
          System.out.println("Element is not found!");  
      }   
       return -1;
   }
}
