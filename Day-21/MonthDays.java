import java.util.*;
public class MonthDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int month=num/30;
        int days=num%30;
        System.out.println(month + "months and " + days + "days");
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java MonthDays      
73
2months and 13days
PS C:\exercise\Assignments\Day-21> java MonthDays
9
0months and 9days
PS C:\exercise\Assignments\Day-21> java MonthDays
0
0months and 0days
*/
