import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        int counter=0;
        int sum = 0;
        int sum1=0;
        int sum2=0;
        int count1=0;
        int counter1=0;
        int key=sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>key){
                System.out.println("greater element than key is " +arr[i]);
            }
            if(arr[i]%2==0){
                 count++;
                 sum+=arr[i];
                 int[] temp=new int[n];
                 temp=arr;
                 System.out.println("even array elements : " +arr[i]);
                 System.out.println("even array " +Arrays.toString(temp));
                }
                if(arr[i]%2!=0){
                    count1++;
                    int[] temp1=new int[n];
                    temp1=arr;
                    sum1+=arr[i];
                    System.out.println("the odd array " +Arrays.toString(temp1));
                    System.out.println("odd array elements : " +arr[i]);
                }
                
                if(arr[i]>0){
                    counter++;
                    sum2=sum2+arr[i];
                    System.out.println("all postive elements in array : "+arr[i]);
                }
                else if(arr[i]==0){
                    System.out.println("zero");
                }
                else if(arr[i]<0){
                    counter1++;
                    System.out.println("all negative elements in array are : "+arr[i]);
                }
            }
            System.out.println("total even elements count : "+count);
            System.out.println("total odd elements count : "+count1);
            System.out.println("even no. sum : "+sum);
            System.out.println("odd no. sum : "+sum1);
            System.out.println("total positive numbers are : " +counter);
            System.out.println("total negative numbers are : " +counter1);
            System.out.println("sum of positive numbers is : " +sum2);
            sc.close();
    }
}
