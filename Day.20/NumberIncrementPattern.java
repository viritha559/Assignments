import java.util.*;
public class NumberIncrementPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-20> java NumberIncrementPattern
4
1 
2 3 
4 5 6
7 8 9 10
*/