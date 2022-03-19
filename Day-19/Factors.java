import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" " );
            }
        }
        sc.close();

    }
    
}
/* output 
PS C:\exercise\Assignments\Day-19> java Factors      
10
1 2 5 10 
*/
