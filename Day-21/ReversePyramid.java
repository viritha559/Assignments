
import java.util.*;
public class ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=num;j>=i;j--){
                System.out.print("*"+" ");
            }
        
            System.out.println();
        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java ReversePyramid      
5
 * * * * * 
  * * * *
   * * *
    * *
     *
*/