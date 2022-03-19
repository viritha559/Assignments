import java.util.*;
public class Power2 {
    static int power(int base,int  exponent){
        int power=1;
        for(int i=1;i<=exponent;i++){
            power=power*base;
        }
        return power;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=2;
        int pow=power(base, exponent);
        System.out.println(base + "to the power "+exponent+ " is : "+pow);
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java Power2      
5
5to the power 2 is : 25
*/
