import java.util.Scanner;
public class Loops {
    public static void main(String[] args)
    {
        int result,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
 n= sc.nextInt();
sc.close();
 for(int i=1;i<=10;i++)
 { 
   result=n*i;
   System.out.println(n+ "X"+i+"="+result); }
    }
    
}
// output
// PS C:\exercise\day 1> java Loops
// enter number
//2
// 2X1=2
// 2X2=4
// 2X3=6
// 2X4=8
// 2X5=10
// 2X6=12
// 2X7=14
// 2X8=16
// 2X9=18
// 2X10=20