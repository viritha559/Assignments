import java.util.*;
public class Reduce {
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(5);
        ar.add(10);
        ar.add(12);
        ar.add(23);
        ar.add(56);
        int n=ar.stream().reduce(1,(a,e)->a*e);
        System.out.println(n);
    } 
}
// output
//772800
