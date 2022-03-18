import java.util.*;
public class ArrayCopyMethod{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of array a : ");
     int n1=sc.nextInt();
     System.out.println("enter size of array b : ");
     int n2=sc.nextInt();
     int a[]=new int[n1];
     System.out.println("enter array a elements : ");
     for(int j=0;j<n1;j++){
         a[j]=sc.nextInt();
     }
    
     int b[]=new int[n2];
     System.out.println("enter array b elements");
     for(int k=0;k<n2;k++){
         b[k]=sc.nextInt();
     }
     int src[],dest[];
     src=a;
     System.out.println("enter srource position: " );
     int srcPos=sc.nextInt();
     dest=b;
     System.out.println("enter dest position: ");
     int destPos=sc.nextInt();
     System.out.println("enter length : ");
     int length=sc.nextInt();
     System.out.print("source array");
      for(int i=0;i<n1;i++){
          System.out.println(a[i]);
      }
      System.out.print("destination array");
      for(int i=0;i<n1;i++){
        System.out.println(b[i]);
    }
    System.out.println();
    System.out.println("source position : "+srcPos);
    System.out.println("destination position : "+destPos);
    System.out.println("length : "+length);
    System.arraycopy(src, srcPos, dest, destPos, length);
     System.out.println("destination array after use of arrayCopy()");
    for(int i=0;i<b.length;i++){
        System.out.print(b[i]);
    } 
    sc.close();
    }
}
/* output
PS C:\exercise\Assignments\Day-20> javac ArrayCopyMethod.java
PS C:\exercise\Assignments\Day-20> java ArrayCopyMethod      
enter size of array a : 
7
enter size of array b : 
7
enter array a elements : 
1 2 3 4 3 2 1
enter array b elements
5 6 7 8 7 6 5
enter srource position: 
5

source position : 1
destination position : 2
length : 4
destination array after use of arrayCopy()
5623435
*/