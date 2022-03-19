import java.util.*;
public class Greeting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("congrats you got A grade ");
        }
        else if(marks>=60 && marks<90) {
            System.out.println("well done yoy got B grade");
        }
        else if(marks>=40 && marks<60){
            System.out.println("average workhard more you got C grade");
        }
        else if(marks>100){
            System.out.println("invalid output");
        }
        else{
            System.out.println("very bad you got less than 30");

        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java Greeting      
105
invalid output
PS C:\exercise\Assignments\Day-21> java Greeting
44
average workhard more you got C grade
*/
