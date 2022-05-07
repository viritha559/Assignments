import java.util.*;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int digit;
        while(number>0){
            digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-27> java SumOfDigits      
123456
21
*/
