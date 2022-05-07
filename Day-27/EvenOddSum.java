import java.util.*;
public class EvenOddSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                evensum=evensum+i;
            }
        }
        System.out.println("even sum is  "+evensum);

           for(int i=1;i<=n;i++){
               if(i%2 !=0){
                   oddsum=oddsum+i;
                }
            }
            System.out.println("odd sum is "+oddsum);
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-27> java EvenOddSum      
10
even sum is  30
odd sum is 25
*/