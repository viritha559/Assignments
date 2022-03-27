import java.util.*;
public class FibonacciRecursion {
    static int n1=0,n2=1,n3=0;
    static void fibonacci( int n){
        if(n>0){
           n3=n1+n2;
           n1=n2;
           n2=n3;
           System.out.print(" "+n3);
           fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        fibonacci(n-2);
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-24> java FibonacciRecursion      
10
0 1 1 2 3 5 8 13 21 34
*/
