import java.util.*;
public class SumOfArithematicSeries {
    static float sumofAP(float a,float d,int n){
        float sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a;
            a=a+d;
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a=sc.nextFloat();
        float d=sc.nextFloat();
        System.out.println(sumofAP(a,d,n));
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-24> java SumOfArithematicSeries
20
2.5
1.5
335.0
PS C:\exercise\Assignments\Day-24> java SumOfArithematicSeries
4
2
1
14.0
*/
