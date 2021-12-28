import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch=65;
                for(int j=i;j<=n;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
            }
            sc.close();
        }    
}

// OUTPUT
// PS C:\exercise\day5> java Pattern17      
// 5
// A B C D E 
// A B C D
// A B C
// A B
// A
