import java.util.Scanner;

public class RangePrime {

static boolean isPrime(int n){
    if(n<2)
    return false;

    for(int i=2;i<n/2;i++){
        if(n%i==0)
        return false;
    }
    return true;
}


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(isPrime(i))
            System.out.print(" "+i);
        }
        sc.close();
    }
}

/* output 
PS C:\exercise\Assignments\Day-27> java RangePrime      
20
 2 3 4 5 7 11 13 17 19
*/
