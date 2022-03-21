import java.util.*;
public class TypeConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    float f=sc.nextFloat();
    int n=(int)f;
    System.out.println("float is converted into int "+n);
    sc.close();
    }

}
/* output
PS C:\exercise\Assignments\Day-21> java TypeConversion      
2.345
float is converted into int 2
*/
