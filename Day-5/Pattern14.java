import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            char ch=65;
            for(int j=1;j<=i;j++){
                System.out.print(ch +" ");
                ch++;

            }

            System.out.println();

        }
        sc.close();
    }
}

//OUTPUT
// PS C:\exercise\day5> java Pattern14      
// 5
// A 
// A B
// A B C
// A B C D
// A B C D E