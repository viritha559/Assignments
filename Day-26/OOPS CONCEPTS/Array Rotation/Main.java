interface Rotate{
   void leftRotate(int arr[],int d,int n);
  void leftRotatebyOne(int arr[],int n);
 void printArray(int arr[],int n);
}
public class Main implements Rotate{
     public void leftRotate(int arr[],int d,int n){
         for(int i=0;i<d;i++){
             leftRotatebyOne(arr,n);
         }
     }
     public void leftRotatebyOne(int arr[],int n){
        int temp=arr[0];
         for(int i=0;i<n-1;i++){
          arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
     }
     public void printArray(int arr[],int n){
         for(int i=0;i<n;i++){
             System.out.println(arr[i]+" ");
         }
        }
     
     public static void main(String[] args){
         Main m=new Main();
         int arr[]={1,2,3,4,5,6};
         m.leftRotate(arr,1,6);
         m.printArray(arr,6);
     }
}
/* output 
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\Array Rotation>java Main
2
3
4
5
6
1
*/