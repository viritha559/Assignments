import java.util.*;
import java.util.regex.*;
public class ExtractNumbers {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String regex="([0-9]+)";
    Pattern r=Pattern.compile(regex);
    Matcher m=r.matcher(str);
    System.out.println("numbers in the string are : ");
    while(m.find()){
        System.out.println(m.group()+" ");
    }
    sc.close();
}   
}
/*
output
PS C:\exercise\Assignments\Day-16> java ExtractNumbers      
viritha559
numbers in the string are : 
559
PS C:\exercise\Assignments\Day-16> java ExtractNumbers
678098765
numbers in the string are : 
678098765
PS C:\exercise\Assignments\Day-16> java ExtractNumbers
356789fghjklert654kjh
numbers in the string are : 
356789
654
*/
