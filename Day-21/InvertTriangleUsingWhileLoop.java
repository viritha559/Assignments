import java.util.*;
public class InvertTriangleUsingWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=n,j;
        while(i>0){
            j=0;
            while(j++<i){
System.out.print("*");
            }
        
            System.out.println();
            i--;
        }
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-21> java InvertTriangleUsingWhileLoop      
5
*****
****
***
**
*
*/