import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n=2;
        int c=0;
        while(c<size){
            boolean flag=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(" "+n);
                c++;
            }
            n++;
        }
        
         sc.close();
    }
}
/* output
PS C:\exercise\Assignments\Day-27> java PrimeNumbers      
10
 2 3 5 7 11 13 17 19 23 29
 */
