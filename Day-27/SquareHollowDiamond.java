import java.util.*;
public class SquareHollowDiamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for( int j=1;j<=2*i-2;j++){
              System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }



        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=2*i-2;k<2*n-2;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

/* output 
PS C:\exercise\Assignments\Day-27> java SquareHollowDiamond      
5
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
