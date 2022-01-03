import java.util.Scanner;
public class TestThrow {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("person is not eligible to vote");
        }
        else{
            System.out.println("person is eligible to vote");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        validate(n);
        System.out.println("rest of the code...");
        sc.close();
    }
    
}
/*
output
PS C:\exercise\Assignments\Day-11> java TestThrow      
13
Exception in thread "main" java.lang.ArithmeticException: person is not eligible to vote
        at TestThrow.validate(TestThrow.java:5)
        at TestThrow.main(TestThrow.java:14)
        
PS C:\exercise\Assignments\Day-11> java TestThrow
20
person is eligible to vote
rest of the code...
*/
