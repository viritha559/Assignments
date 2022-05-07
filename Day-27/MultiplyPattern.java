import java.util.*;
public class MultiplyPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                int k=j*i;
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-27> java MultiplyPattern      
6
0 
0 1
0 2 4
0 3 6 9
0 4 8 12 16
0 5 10 15 20 25
0 6 12 18 24 30 36
*/ 
