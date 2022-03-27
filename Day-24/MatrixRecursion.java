import java.util.*;
public class MatrixRecursion{
    static void interchangedaigonals(int arr[][],int n){
        for(int i=0;i<n;++i){
            if(i !=n/2){
               int temp=arr[i][i];
               arr[i][i]=arr[i][n-i-1];
               arr[i][n-i-1]=temp;
            }
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=0;j<n;j++){
         arr[i][j]=sc.nextInt();
    }
}
    interchangedaigonals(arr,n);
    sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-24> java MatrixRecursion      
3
1 2 3 4 5 6 7 8 9
3 2 1 
4 5 6
9 8 7
*/