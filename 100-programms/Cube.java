import java.util.Scanner;
public class Cube {
    public static void main(String[] args)
{
 Scanner sc =new Scanner(System.in);
 double base=sc.nextDouble();
 double power=sc.nextDouble();
 System.out.println("enter a number");
 double k=Math.pow(base,power);
 System.out.println(k);
 sc.close();
}    
}
// output
// PS C:\exercise\100programms> java Cube      
// 2 3
// enter a number
// 8.0
// PS C:\exercise\100programms> java Cube
// 5 4
// enter a number
// 625.0