import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%400==0) || ((year%100!=0) && (year%4==0))){
            System.out.println(year + " year is a leap year" );
        }
        else{
            System.out.println(year + "year is not  a leap year");
        }
    sc.close();
    }
        
    
}
/* output 
3year is not  a leap year
PS C:\exercise\Assignments\Day-21> java LeapYear
2014
2014year is not  a leap year
PS C:\exercise\Assignments\Day-21> java LeapYear
2016
2016 year is a leap year
*/
