import java.util.*;
import java.util.regex.*;
public class SplitByNewLine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern r=Pattern.compile("\\s+");
        Matcher m=r.matcher(str);
        String result=m.replaceAll("\n");
        System.out.println(result);
        sc.close();
    }  
}
/*
output
PS C:\exercise\Assignments\Day-16> java SplitByNewLine      
java is a platform independent language 123
java
is
a
platform
independent
language
123
*/
