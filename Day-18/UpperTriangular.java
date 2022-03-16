import java.util.*;
public class UpperTriangular {
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i){
                     sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("The sum of Upper triangular Matrix is :"+sum);
    }
}

/*  
output:
-------

3
1 2 3 4 5 6 7 8 9
1 2 3 
4 5 6
7 8 9 
The sum of Upper triangular Matrix is :19


*/