import java.util.*;
public class CummulativeSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
            int sum[]=cummulativeSum(numbers);
            System.out.println(Arrays.toString(sum));
            sc.close();
        }
        
       public static  int[] cummulativeSum(int[] numbers){
            int sum=0;
            for(int i=0; i<numbers.length; i++){
                sum+=numbers[i];
                numbers[i]=sum;
            }
            return numbers;
        }
    }
/* output 
PS C:\exercise\Assignments\Day-22> java CummulativeSum      
6
9 8 7 4 7 2
[9, 17, 24, 28, 35, 37]
*/



    
    

