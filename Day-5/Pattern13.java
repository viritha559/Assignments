import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(i+" ");

            }
            System.out.println();
        }
        sc.close();
    }
    
}
// output
//PS C:\exercise\day5> java Pattern13      
// 5
// 5 
// 4 4
// 3 3 3
// 2 2 2 2
// 1 1 1 1 1
