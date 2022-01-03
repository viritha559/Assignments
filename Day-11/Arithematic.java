import java.util.Scanner;
public class Arithematic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            
            int result=a/b;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e);
    
        }
        finally{
            System.out.println("finally block is executing");
        }
        sc.close();
    }
}

/*
output
PS C:\exercise\Assignments\Day-11> java Arithematic
2
8
0
finally block is executing
PS C:\exercise\Assignments\Day-11> java Arithematic
20
10
2
finally block is executing
PS C:\exercise\Assignments\Day-11> java Arithematic
10
0
java.lang.ArithmeticException: / by zero
finally block is executing
*/