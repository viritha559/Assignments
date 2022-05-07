import java.util.*;
public class NumberSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=1;
        System.out.println(number);
        for(int i=1;i<=num;i++){
             number=number*2;
        System.out.print(" "+number);
        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-27> java NumberSeries
5
1
 2 4 8 16 32
 */
