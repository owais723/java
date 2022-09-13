/*write a program using arrays for counting frequency of each character in an array */
package javaapplication1;

import java.util.Scanner;

public class CharFreq
{    
    public static void main(String ar[]){
      String str;   
      Scanner s=new Scanner(System.in);
      System.out.println("enter any string");
      str=s.nextLine();
      int i;
      int freq[]=new int[str.length()];
      char a[]=str.toCharArray();
      for(i=0;i<str.length();i++)
      {
          freq[i]=1;
          for(int j=i+1;j<str.length();j++){
            if(a[i]==a[j]){
                freq[i]++;
                a[j]='0';
            }  
          }
       }
       System.out.println("characters with their frequencies");
        System.out.print(str+"--->");
        for(i=0;i<freq.length;i++){
            if(a[i]!='0'&& a[i]!=' '){
                 System.out.print(a[i]+""+freq[i]);
            }
        }
         System.out.println("");
   }    
}
