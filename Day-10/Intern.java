import java.util.Scanner;
 class Intern {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        str=new String(str);
        String str1=sc.nextLine();
         String str3=str1.intern();
         System.out.println(str==str1);//returns the false because reference variable is points to the different instance
         System.out.println(str1==str3);//returns true because the reference variable is pointng to the same instance
         sc.close();
    }
}
/* 
outout
PS C:\exercise\Assignments\Day-10> java Intern      
viritha
viritha
false
true
*/
