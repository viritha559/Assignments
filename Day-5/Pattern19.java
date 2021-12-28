import java.util.Scanner;
public class Pattern19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){

                char ch=(char)('A'+ i-1);
                System.out.print(ch +" ");
            }

            System.out.println();

        }
        sc.close();
    }
}

// OUTPUT
// PS C:\exercise\day5> java Pattern19      
// 5
// E E E E E 
// D D D D
// C C C
// B B
// A
