import java.util.regex.*;
import java.util.*;
public class Space{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    Pattern r=Pattern.compile("\\s+");
    Matcher m=r.matcher(str);
    String result=m.replaceAll(" ");
    System.out.println(result);
    sc.close();

      }
}
/* 
output
PS C:\exercise\Assignments\Day-14> java Space
A    line with    multiple spaces  between         some words
A line with multiple spaces between some words
*/
