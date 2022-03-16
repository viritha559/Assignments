import java.util.*;
public class CommonElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[b];
        for(int i=0;i<a;i++){
            System.out.println("enter array1 elements ");
            arr1[i]=sc.nextInt();       
        }
        for(int j=0;j<b;j++){
            System.out.println("enter array2 elements ");
            arr2[j]=sc.nextInt();
        }
       Set<Integer> set1=new HashSet<Integer>();
       Set<Integer> set2=new HashSet<Integer>();
         for(int i:arr1){
             set1.add(i);
         }
         for(int i:arr2){
             set2.add(i);
         }
         set1.retainAll(set2);
         System.out.println(set1);
         sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-18> java CommonElements      
3
4
enter array1 elements 
3
enter array1 elements 
4
enter array1 elements 
5
enter array2 elements 
6
enter array2 elements 
4
enter array2 elements 
5
enter array2 elements 
3
[3, 4, 5]
*/
