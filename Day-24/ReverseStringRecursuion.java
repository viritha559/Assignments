import java.util.*;
public class ReverseStringRecursuion {
    void reverseString(String str){
        if((str==null) || (str.length()<=1)){
            System.out.println(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        ReverseStringRecursuion rs=new ReverseStringRecursuion ();
        rs.reverseString(str);
        sc.close();

    }
    
}
/* output 
PS C:\exercise\Assignments\Day-24> java ReverseStringRecursuion      
hello everyone
enoyreve olleh
*/
