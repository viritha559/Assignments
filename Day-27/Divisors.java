import java.util.*;
public class Divisors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                System.out.print(" " +i);
        }
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-27> java Divisors      
100
 1 2 4 5 10 20 25 50 100
 */
