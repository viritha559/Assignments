import java.util.*;
public class CharAt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=sc.nextInt();
        try{
        System.out.println(str.charAt(i));
        }
        catch(Exception e){
          System.out.println("the index given is greater the length of the string");
          System.out.println("so,please enter the valid index");

        }
        sc.close();
    }
}
/* 
PS C:\exercise\Assignments\Day-10> javac CharAt.java
PS C:\exercise\Assignments\Day-10> java CharAt      
Viritha varma Kanumuri
4
t
*/