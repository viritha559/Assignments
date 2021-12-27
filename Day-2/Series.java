import java.util.Scanner;
import java.lang.Math;
public class Series
{
    public static void main(String[] args)
    {
        int result;
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        result=a;
        for(int j=0;j<=n-1;j++)
        {
            result+=(((Math.pow(2,j))*b));
            System.out.print("  "+result);
        }
    }      
    sc.close();
    }
}