import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     System.out.println("original String :"+str);
      String revsString=(new StringBuffer(str)).reverse().toString();
     System.out.println("reverse string : " +revsString); 
     if(str.equalsIgnoreCase(revsString)){
         System.out.println("palindrome");
     }
     else{
         System.out.println("not  a palindrome");
     }
     sc.close();
    }
}
// output
// PS C:\exercise\100programms> java Palindrome      
// radar
// original String :radar
// reverse string : radar
// palindrome
// PS C:\exercise\100programms> java Palindrome
// viritha
// original String :viritha
// reverse string : ahtiriv
// not  a palindrome