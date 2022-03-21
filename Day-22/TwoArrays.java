import java.util.*;
public class TwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1 !=n2){
            System.out.println("both array must have same number of elements" );
            return ;
        }
        int arr1[]= new int[n1];
        int arr2[]= new int[n1];
        int arr3[]= new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<n1; i++){
            arr2[i]=sc.nextInt();

        }
        for(int i=0;i<arr3.length; i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        System.out.println("resultant array : " + Arrays.toString(arr3));
        if(Arrays.equals(arr1,arr2)){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays r not equal");
        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-22> java TwoArrays      
4
4
1 2 3 4
5 6 7 8
resultant array : [6, 8, 10, 12]
PS C:\exercise\Assignments\Day-22> java TwoArrays
3 
4
both array must have same number of elements
*/
