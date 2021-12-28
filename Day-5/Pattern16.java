import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            char ch=65;
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
            }
            sc.close();
        }    
}

// OUTPUT
// PS C:\exercise\day5> java Pattern16      
// 5
//  A B C D E 
//   A B C D
//    A B C
//     A B
//      A
