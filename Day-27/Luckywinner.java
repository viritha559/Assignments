import java.util.*;
public class Luckywinner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=num%10;
        if(rem==3 || rem==8){
            System.out.println("Lucky winner");
        }
        else{
            System.out.println("not a lucky winner");
        }
        sc.close();
    }
}

/* output 
PS C:\exercise\Assignments\Day-27> java Luckywinner
43
Lucky winner
PS C:\exercise\Assignments\Day-27> java Luckywinner
41
not a lucky winner
*/
