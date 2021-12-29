import java.util.Scanner;
public class Pattern27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
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
PS C:\exercise\day 5> java Pattern27      
5
E 
E D
E D C
E D C B
E D C B A
*/
