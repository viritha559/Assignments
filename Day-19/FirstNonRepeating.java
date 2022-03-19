import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(char i :str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println("first non repeating character :"+i);
                break;
            }
        }
        sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-19> java FirstNonRepeating      
viritha
first non repeating character :v
PS C:\exercise\Assignments\Day-19> java FirstNonRepeating      
madam
first non repeating character :d
*/