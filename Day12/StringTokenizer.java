import java.util.*;
public class StringTokenizer {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String st="[ :,'&%$#@!-_]";
    String[]  result=str.split(st);
    int count=result.length;
    System.out.println(count);
    for( String  a : result){
        System.out.println(a);
    }
    sc.close();
}    
}
/* 
output
PS C:\exercise\Assignments\Day-12> java StringTokenizer      
he is a very very good boy,isn't he?
10
he
is
a
very
very
good
boy
isn
t
he
*/
