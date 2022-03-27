import java.util.*;
public class SumOfDigitRecursion {
    static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        else{
            return(n%10+sumofdigit(n/10));
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sumofdigit(n);
        System.out.println(result);
        sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-24> java SumOfDigitRecursion     
12345
15
*/
