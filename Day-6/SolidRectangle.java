import java.util.Scanner;
public class SolidRectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+2;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}

// OUTPUT
// PS C:\exercise\day 9> java SolidRectangle     
// 3
// *  *  *  *  *  
// *  *  *  *  *  
// *  *  *  *  *  