import java.util.*;
public class TwoMatrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[][] = new int[n1][n1];
        int arr2[][] = new int[n2][n2];
        int arr3[][]=new int[n1][n1];
        int arr4[][]=new int[n1][n1];
        int arr5[][]=new int[n1][n1];

        for (int i=0; i<n1; i++){
            for (int j=0; j<n1; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
            for (int i=0; i<n2; i++){
                for (int j=0; j<n2; j++){
                    arr2[i][j]=sc.nextInt();
                }
    }
    for(int i=0; i<n1;i++){
        for (int j=0; j<n1; j++){
            arr3[i][j]=arr1[i][j]+arr2[i][j];
            System.out.print(arr3[i][j]+" ");
        }

        System.out.println();

    }
    for(int i=0; i<n1;i++){
        for (int j=0; j<n1; j++){
            arr4[i][j]=arr1[i][j]-arr2[i][j];
            System.out.print(arr4[i][j]+" ");
        }

        System.out.println();
    }
    for(int i=0; i<n1;i++){
        for (int j=0; j<n1; j++){
            arr5[i][j]=arr1[i][j]*arr2[i][j];
            System.out.print(arr5[i][j]+" ");
        }

        System.out.println();
    }
    sc.close();
}
}
/* output 
PS C:\exercise\Assignments\Day-22> javac TwoMatrices.java
PS C:\exercise\Assignments\Day-22> java TwoMatrices      
3
3
1 1 1 2 2 2 3 3 3 
1 1 1 2 2 2 3 3 3
2 2 2 
4 4 4
6 6 6
0 0 0
0 0 0
0 0 0
1 1 1
4 4 4
9 9 9
*/
