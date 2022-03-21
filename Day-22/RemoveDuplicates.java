import java.util.*;
public class RemoveDuplicates {
    static int remove(int arr[],int n){
        if(n==0 || n==1){
            return n;
        }
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1])
                temp[j++]=arr[i];
            
            temp[j++]=arr[n-1];
            
            for( i=0;i<n;i++)
                arr[i]=temp[i];
        }
        return j;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        n=remove(arr,n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-22> java RemoveDuplicates      
4
45 54 45 54
45 
54 
*/