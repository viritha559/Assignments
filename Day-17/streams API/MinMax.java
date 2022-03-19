import java.util.*;
public class MinMax {
    public static void main(String[] args){
        ArrayList<Integer>ar=new ArrayList<Integer>();
        ar.add(11);
        ar.add(5);
       int temp= ar.stream().min((val1,val2)->(val1.compareTo(val2))).get();
       System.out.println(temp);
       //5
       int num=ar.stream().max((val1,val2)->(val1.compareTo(val2))).get();
       System.out.println(num);
       // 11
    }

}