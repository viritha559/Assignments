import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+"");

            }
            System.out.println();
        }
        sc.close();

    }
    
}
/*
output
PS C:\exercise\day 5> java Pattern9      
5
 54321
  4321
   321
    21
     1
*/
