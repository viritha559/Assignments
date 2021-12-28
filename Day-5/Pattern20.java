import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print((char) ('A' +j-1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// OUTPUT
// PS C:\exercise\day5> java Pattern20
// 5
// E 
// D E 
// C D E 
// B C D E 
// A B C D E 
