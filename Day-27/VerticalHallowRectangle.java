import java.util.*;
public class VerticalHallowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-27> java VerticalHallowRectangle      
4
****
*  *
*  *
****
*/