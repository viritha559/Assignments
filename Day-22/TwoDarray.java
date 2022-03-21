import java.util.*;
public class TwoDarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n[][]=new int[n1][n1];
        int sum=0;
        int transpose[][]=new int[n1][n1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<n1;j++){
                n[i][j]=sc.nextInt();
             System.out.print(n[i][j]+" ");
                if( n[i]==n[j]){
                    sum+=n[i][j];
                }
            }
            System.out.println();
        }
        
        System.out.println("sum of diagonal elements : "+sum);
        for(int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                transpose[i][j]=n[i][j];
              System.out.print(transpose[i][j]+" ");

        }
        System.out.println();
    }
        sc.close();
        
    }
}

/* output 
PS C:\exercise\Assignments\Day-22> java TwoDarray      
2
1 2 3 4
1 2 
3 4 
sum of diagonal elements : 5
1 3 
2 4
PS C:\exercise\Assignments\Day-22> java TwoDarray
3
1 2 3 4 5 6 7 8 9
1 2 3 
4 5 6 
7 8 9 
sum of diagonal elements : 15
1 4 7
2 5 8 
3 6 9
*/
