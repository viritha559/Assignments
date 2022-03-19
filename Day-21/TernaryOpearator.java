import java.util.*;
public class TernaryOpearator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int max=(num1>num2)?num1:num2;
        System.out.println("the maximum number is : " +max);
        int min=(num2>num1)?num1:num2;
        System.out.println("the minimum number is : " +min);
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java TernaryOpearator      
44
88
the maximum number is : 88
the minimum number is : 44
*/
