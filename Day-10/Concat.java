import java.util.*;
public class Concat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        System.out.println("first string is : "+str1);
        System.out.println("second string is : "+str2);
        String result=str1.concat(str2);
        System.out.println(result);
        System.out.println(str1.concat(str2).concat(str3));// concating multiple strings 
        System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str3));// concat multiple strings with spaces
        sc.close();
    }
    
}
// out put
// PS C:\exercise\day 10> java Concat      
// viritha
// varma
// kanumuri
// first string is : viritha
// second string is : varma
// virithavarma
// virithavarmakanumuri
// viritha varma kanumuri
