import java.util.*;
public class AcceptNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="(((^[1-3])([0-9]*[A-Za-z]*)){1,10})";
        if(str.matches(regex)){
            System.out.println("string is accepted");
        }
        else{
            System.out.println("not accepted");
        }
        sc.close();
        
    }
}
/* 
output
PS C:\exercise\Assignments\Day-16> java AcceptNumbers      
123456789u
string is accepted
PS C:\exercise\Assignments\Day-16> java AcceptNumbers
45fyhf34
not accepted
PS C:\exercise\Assignments\Day-16> java AcceptNumbers
gvutdc5679032
not accepted
*/