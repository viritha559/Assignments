import java.util.Scanner;
public class SubArray {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Array[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum +=Array[j];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();

    }
    
}
/*
output
PS C:\exercise\Assignments\Day-12> java SubArray
5
1 -2 4 -5 1
9
*/
