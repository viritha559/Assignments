import java.util.*;
public class InvertFullPyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                    System.out.print("*");
            }
        
            System.out.println();
        }
    
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-27> java InvertFullPyramid      
5
 *********
  *******
   *****
    ***
     *
*/