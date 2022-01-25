import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse().toString());
        sc.close();
    }
    
}
/* 
output
PS C:\exercise\Assignments\Day-14> java ReverseString
viritha
ahtiriv
PS C:\exercise\Assignments\Day-14> java ReverseString      
accretion
noitercca
*/
