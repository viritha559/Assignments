import java.util.Scanner;
public class Power {
    public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("enter a base");
 int base=sc.nextInt();
 System.out.println("enter a power");
 int power=sc.nextInt();
 int k=(int) Math.pow(base,power);
 System.out.println("number after power");
 System.out.println(k);
 sc.close();
}    
}
/* output 
PS C:\exercise\Assignments\Day-24> java Power
enter a base
2
enter a power
0
number after power
1
*/