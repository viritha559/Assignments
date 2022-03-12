import java.util.*;
import java.util.regex.*;
public class Delimiter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex=".at";
        Pattern r=Pattern.compile(regex);
        Matcher m=r.matcher(str);
        String result=m.replaceAll("\n");
        System.out.println(result);
        sc.close();
    }
    
}
/* 
output
PS C:\exercise\Assignments\Day-16> java Delimiter      
I have a cat.i play cricket with bat.i dont like rat,i hate mat,now break it
I have a 
.i play cricket with
.i dont like
,i
e
,now break it
*/
