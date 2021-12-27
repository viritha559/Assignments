import java.util.*;
public class Contains {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1.contains(str2));
        System.out.println(str2.contains(str1));
       boolean isContains=str1.contains(str2);// for case sensitive 
        System.out.println(isContains);
        if(str1.contains(null)){ // throws null pointer exception
            System.out.println(" inside if block");
        }
        else{
            System.out.println("inside else block");
        }

        sc.close();
    }
    
}
// out put
// PS C:\exercise\day 10> java Contains      
// viritha varma
// viritha
// true
// false
// true
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.CharSequence.toString()" because "s" is null
//         at java.base/java.lang.String.contains(String.java:2851)
//         at Contains.main(Contains.java:11)
