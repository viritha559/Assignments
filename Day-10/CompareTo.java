import java.util.*;
public class CompareTo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine(); 
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        System.out.println(str1.compareTo(str2));// returns the Difference of string lexicographically >->+,<->-,=0
        System.out.println(str1.compareTo(str3));// second string is empty it returns first string length
        System.out.println(str3.compareTo(str1));// first string is empty returns -ve value of second string
        sc.close();

    }
}
// output
// PS C:\exercise\day 10> java CompareTo
// viritha
// Viritha
// 
// 32
// 7
// -7