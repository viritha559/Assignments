import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array ");
        int n=sc.nextInt();
        System.out.println("enter key to search");
        int key=sc.nextInt();
        int arr[] = new int[n];
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int result=Arrays.binarySearch(arr,key);
        if(result<0){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index : " +result);
        }
        sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-22> java BinarySearch      
enter size of array 
5
enter key to search
3
4 2 3  5 1
element found at index : 2
PS C:\exercise\Assignments\Day-22> java BinarySearch
enter size of array 
3
enter key to search
5
4 2 1
element not found
*/
