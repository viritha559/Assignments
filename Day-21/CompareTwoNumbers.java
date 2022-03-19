import java.util.*;
public class CompareTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1=sc.nextInt();
        System.out.println("enter second number : ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + "is greater than "+num2);
        }
        else if(num1==num2){
            System.out.println(num1 + "is equals to "+num2);
        }
        else{
            System.out.println(num1 + "is less than "+num2);
        }
        sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-21> java CompareTwoNumbers
enter first number : 
22
enter second number : 
55
22is less than 55
PS C:\exercise\Assignments\Day-21> java CompareTwoNumbers
enter first number : 
77
enter second number : 
33
77is greater than 33
PS C:\exercise\Assignments\Day-21> java CompareTwoNumbers
enter first number : 
11
enter second number : 
11
11is equals to 11
*/
