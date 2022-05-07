import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            for(int j=n;j>=i;j--) {
                  System.out.print(" "+j);
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-27> java ReverseNumber      
4
 4 3 2 1
 4 3 2
 4 3
 4
 */
