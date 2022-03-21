import java.util.*;
public class EvenOddAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        double evenavg=0,oddavg=0;
         int evensum=0,oddsum=0;
        int evencount=0,oddcount=0;
        for(int i=0;i<num;i++){
            if(i%2==0){
                evensum+=i;
                evencount++;
            }
            else{
                oddsum+=i;
                oddcount++;
            }
        }
        evenavg=evensum/evencount;
        oddavg=oddsum/oddcount;
        System.out.println("average of even numbers are :"+evenavg);
        System.out.println("average of odd numbers are :"+oddavg);
        sc.close();


    }
    
}
/* Output
PS C:\exercise\Assignments\Day-21> java EvenOddAvg      
10
average of even numbers are :4.0
average of odd numbers are :5.0
PS C:\exercise\Assignments\Day-21> java EvenOddAvg
2
average of even numbers are :0.0
average of odd numbers are :1.0
PS C:\exercise\Assignments\Day-21> java EvenOddAvg
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at EvenOddAvg.main(EvenOddAvg.java:19)
*/
