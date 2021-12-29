import java.util.Scanner;
public class Pattern26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print((char)('A'+j-1)+" ");
            }
        
            System.out.println();
        }

        sc.close();
    }
}
/*
output
PS C:\exercise\day 5> java Pattern26      
5
E D C B A 
E D C B
E D C
E D
E
*/
    