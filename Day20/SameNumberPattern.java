import java.util.*;
public class SameNumberPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/* output
PS C:\exercise\Assignments\Day-20> java SameNumberPattern      
4

1
2 2
3 3 3
4 4 4 4
*/