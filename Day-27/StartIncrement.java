import java.util.*;
public class StartIncrement {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=i;j>=1;j--){
               System.out.print(" "+j);
           }
           System.out.println();
       }
       sc.close();
   } 
}
/* output 
PS C:\exercise\Assignments\Day-27> java StartIncrement      
5
 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
 */
