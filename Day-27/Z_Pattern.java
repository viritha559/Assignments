import java.util.*;
public class Z_Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n || (i+j)==n+1 || i==1){
                System.out.print(" "+j);
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

/* output 
PS C:\exercise\Assignments\Day-27> java Z_Pattern
5
 1 2 3 4 5
       4
     3
   2
 1 2 3 4 5
*/