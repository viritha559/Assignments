import java.util.Scanner;
 class Replace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();    
        String result="Viritha";
        System.out.println(str.replace(result,"Suchithra"));
        System.out.println(str.replace("good","bad"));
        String replaceall=str.replaceAll("a","@");
        System.out.println(replaceall);
        sc.close();
    }    
}
/* output 
PS C:\exercise\Assignments\Day-10> java Replace      
Viritha is a good girl
Suchithra is a good girl
Viritha is a bad girl
Virith@ is @ good girl
*/