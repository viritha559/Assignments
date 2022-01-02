import java.util.Scanner;
public class SquareMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first[][]=new int[n][n];
        int i,j, sum1=0,sum2=0;
        for(i=0;i<n;i++){
            for( j=0;j<n;j++){
                first[i][j]=sc.nextInt();
            }
        }
      for(i=0;i<n;i++){
          for(j=0;j<n;j++){
            System.out.print(first[i][j]+" ");
          }
      System.out.println();
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j){
            sum1 += first[i][j];
            }
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==n-j-1){
                sum2=sum2+first[i][j];
        }
        }
        }
        int diff=Math.abs(sum1-sum2);
        System.out.println(diff);
        sc.close();
    }
}
/*
output
PS C:\exercise\Assignments\Day-12> java SquareMatrix      
3
11 2 4
4 5 6
10 8 -12
11 2 4 
4 5 6
10 8 -12
15
*/
