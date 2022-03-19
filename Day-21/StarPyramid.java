import java.util.*;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=num;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
        
            System.out.println();
        }
        sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-21> java StarPyramid      
5
     * 
    * * 
   * * * 
  * * * * 
 * * * * *
  */