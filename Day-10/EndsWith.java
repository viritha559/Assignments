import java.util.*;
public class EndsWith {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    System.out.println(str1.endsWith(str2));
    System.out.println(str1.endsWith(" "));//space after string returns true else false
    System.out.println(str1.endsWith(null));// null pointer exception
    sc.close();
}    
}
// output
// PS C:\exercise\day 10> java EndsWith      
// viritha 
// varma
// false
// true
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "suffix" is null
//         at java.base/java.lang.String.endsWith(String.java:2312)
//         at EndsWith.main(EndsWith.java:9)
