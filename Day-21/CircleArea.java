import java.util.*;
public class CircleArea {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int radius=sc.nextInt();
    double circle=3.14*radius*radius;
    System.out.println("area of circle is : "+ circle);
    sc.close();
    }
}
/* output  
PS C:\exercise\Assignments\Day-21> java CircleArea      
5
area of circle is : 78.5
*/