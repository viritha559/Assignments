import java.util.*;
public class PerfectSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double sqrt=Math.sqrt(num);
        double result=(sqrt-Math.floor(sqrt));
        if(result==0){
            System.out.println(num +" is a  perfect number");
        }
        else{
            System.out.println(num +" is a not perfect number");
        }
        sc.close();
    }

}

/* output 
PS C:\exercise\Assignments\Day-27> java PerfectSquare      
6
6 is a perfect number
PS C:\exercise\Assignments\Day-27> java PerfectSquare
9
9 is a  not perfect number
*/