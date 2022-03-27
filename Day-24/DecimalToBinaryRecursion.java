import java.util.*;
public class DecimalToBinaryRecursion {
    static int find(int decimalnumber){
        if(decimalnumber==0) {

            return 0;
        }
        else{
            return(decimalnumber%2+10*find(decimalnumber/2));
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int decimalnumber=sc.nextInt();
        System.out.println(find(decimalnumber));
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-24> java DecimalToBinaryRecursion
0
0
PS C:\exercise\Assignments\Day-24> java DecimalToBinaryRecursion
7
111
PS C:\exercise\Assignments\Day-24> java DecimalToBinaryRecursion
20
10100
*/