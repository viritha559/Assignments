import java.util.*;
public class X_Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n*2-1;
        int num=1;
        for(int i=1;i<=temp;i++){
            for(int j=1;j<=temp;j++){
                if(i==j || j==temp-i+1){
                    System.out.print(num);
                }
                System.out.print(" ");
            }
            System.out.println();
            num=(i<=temp/2) ? ++num :--num ;
        }
        sc.close();
    }
}

/* output 
PS C:\exercise\Assignments\Day-27> java X_Pattern      
6
1          1 
 2        2  
  3      3   
   4    4    
    5  5     
     6      
    5  5     
   4    4    
  3      3   
 2        2
1          1
*/
