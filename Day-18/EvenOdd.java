import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        int sum=0;
        int product=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            sum=sum + arr[i];
            product=product*arr[i];
        }
        System.out.println();
        if(sum%2==0){
            System.out.println("The sum is even: "+sum);
        }
        else{
            System.out.println("The sum is odd so,we have to print the product of the elements: "+product);
        }
        sc.close();
    }    
}
/*  
output:
-------

3
1 2 3
1 2 3 
The sum is even: 6

*/

