import java.util.*;
public class ReverseArray {
    static void reverse(int a[],int n){
        int[] b=new int[n];
        int j=n;
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j=j-1;
        }
        System.out.println("reverse array is : ");
        for(int k=0;k<n;k++){
            System.out.print(b[k]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,arr.length);
        sc.close();
    }
}
/* Output
PS C:\exercise\Assignments\Day-22> java ReverseArray      
5
1 2 3 4 5
reverse array is : 
5 4 3 2 1
*/
