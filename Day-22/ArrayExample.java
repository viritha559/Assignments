import java.util.*;
public class ArrayExample {
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(3);
        ar.add(19);
        ar.add(44);
        ar.add(13);
        ar.add(20);
        System.out.println("array after adding elements : "+ar);
        ar.remove(2);
        ar.remove(1);
        System.out.println("array after removing elements : "+ar);
        ar.add(2,50);
        System.out.println("after inserting element at a specific position "+ar);
    }
}
/* output
PS C:\exercise\Assignments\Day-22> java ArrayExample      
array after adding elements : [3, 19, 44, 13, 20]
array after removing elements : [3, 13, 20]
after inserting element at a specific position [3, 13, 50, 20]
 */
