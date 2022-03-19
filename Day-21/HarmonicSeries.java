import java.util.*;
public class HarmonicSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double result=0.0;
        while(num>0){
            result=result+(double)1/num;
            num--;
            System.out.println(result + " ");
        }
        sc.close();
    }
}
/* output
PS C:\exercise\Assignments\Day-21> javac HarmonicSeries.java
PS C:\exercise\Assignments\Day-21> java HarmonicSeries      
5
0.2 
0.45 
0.7833333333333333 
1.2833333333333332 
2.283333333333333 
*/