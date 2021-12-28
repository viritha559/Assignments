// program to print the ascii value for a given charecter
import java.util.*;
public class Ascii{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int equivalentAscii = sc.next().charAt(0);
    System.out.println("user input is : "+(char)equivalentAscii);
    System.out.println("the equivalent Ascii id :" +equivalentAscii);
    sc.close();
  }
}
//output 
// PS C:\exercise\100programms> java Ascii
// v
// user input is : v
// the equivalent Ascii id :118