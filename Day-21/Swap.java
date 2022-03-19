import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1=sc.nextInt();
        System.out.println("enter num2 : ");
        int num2=sc.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("numbers after swapping : ");
        System.out.println("num1 value : "+num1 +" num2 value : "+num2);
        sc.close();
        
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java Swap      
enter num1 : 
44
enter num2 : 
66
numbers after swapping : 
num1 value : 66 num2 value : 44
*/
