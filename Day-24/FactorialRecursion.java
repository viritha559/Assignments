import java.util.*;
public class FactorialRecursion{
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int num=sc.nextInt();
        fact=factorial(num);
        System.out.println("factorial of "+num+ "is "+ fact);
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-24> java FactorialRecursion
factorial of 5is 120
PS C:\exercise\Assignments\Day-24> java FactorialRecursion
1
factorial of 1is 1
PS C:\exercise\Assignments\Day-24> java FactorialRecursion
0
factorial of 0is 1
*/