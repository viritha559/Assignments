import java.util.*;
import java.lang.Math;
public class Amstrong {
    static boolean isAmstrong(int n){
        int temp,digits=0,last=0,sum=0;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        temp=n; 
        while(temp>0){
            last =temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(n==sum)
        return true;
        else return false;
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number : ");
int num=sc.nextInt();
if(isAmstrong(num)){
    System.out.println("is amstrong");
}
else{
    System.out.println("not a amstrong");
}
sc.close();
    }
}
/* output
PS C:\exercise\Assignments\Day-21> java Amstrong
enter number : 
55
not a amstrong
PS C:\exercise\Assignments\Day-21> java Amstrong
enter number : 
153
*/