public class LinearSearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a1={3,6,5,22,8,7};
        int key=22;
        System.out.println("key present at index "+linear(a1,key));
    }
    
}
