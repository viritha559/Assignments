import java.util.*;
public class PascalTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" ");
            }
            int c=1;
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            System.out.println();
        }
            
            sc.close();
        
    }
}

/* output 
PS C:\exercise\Assignments\Day-27> java PascalTriangle      
5
     1 
     1 1
     1 2 1 
     1 3 3 1
     1 4 6 4 1
*/