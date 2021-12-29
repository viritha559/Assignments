import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n){
                    System.out.print(j+" ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
output
PS C:\exercise\Assignments\Day6> java Pattern5      
5
    1 
   1 2
  1   3
 1     4
1 2 3 4 5
*/

    
