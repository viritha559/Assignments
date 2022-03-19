import java.util.*;
import java.util.regex.*;
public class RemoveSpecialCharacters {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();
          String regex="[!@#$%^&*()_+?><]";
          Pattern r=Pattern.compile(regex);
          Matcher m=r.matcher(str);
          String result=m.replaceAll("");
          System.out.println(result);
          sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-19> java RemoveSpecialCharacters      
V!r!t#@v@rm@ 
Vrtvrm
*/
