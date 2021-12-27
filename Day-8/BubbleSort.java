import java.util.Scanner;
public class BubbleSort {
    public static void printArray(int array[],int size)
    {
        for(int i=0;i<size;i++)
        System.out.print(array[i]+" ");
    }
    public static void sort(int array[],int size)
    {
        for(int i=0; i<size;i++)
        {
            for(int j=0; j<size; j++)
            {
                if(j!=size-1)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }
        printArray(array,size);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++)
            arr[i]=scan.nextInt();
        scan.close();
        System.out.println("Before sorting:");
        printArray(arr,size);
        System.out.println();
        System.out.println("After sorting:");
        sort(arr,size);
    }
}

// output
// PS C:\exercise\day7> java BubbleSort
// Enter array size:5
// Enter array elements:
// 56 23 98 34 66
// Before sorting:
// 56 23 98 34 66 
// After sorting:
// 23 34 56 66 98 