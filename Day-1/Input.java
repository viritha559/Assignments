import java.util.Scanner;
public class Input {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter input data");
    int i= sc.nextInt();
    double d= sc.nextDouble();
    sc.nextLine();
    String s= sc.nextLine();
    sc.close();
    System.out.println("Integer:" +i);
    System.out.println("Double:" +d);
    System.out.println("String:" +s);
}
    
}
// out put
// PS C:\exercise\day 1> java Input 
// enter input data
// 42
// 3.1415
// Happy learning!
// Integer:42
// Double:3.1415
// String:Happy learning!