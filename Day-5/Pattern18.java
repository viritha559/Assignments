import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){

                char ch=(char)('A'+ i+0);
                System.out.print(ch +" ");
            }

            System.out.println();

        }
        sc.close();
    }
}

// OUTPUT
// PS C:\exercise\day5> java Pattern18      
// 5
// A 
// B B
// C C C
// D D D D
// E E E E E
