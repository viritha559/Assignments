import java.util.*;
import java.util.stream.Stream;
public class Count_Toarray {
    public static void main(String[] args){
        List<String>ar=new ArrayList<String>();
        ar.add("abc");
        ar.add("def");
        ar.add("ghi");
        ar.add("jkl");
        long l= ar.stream().count();
        System.out.println(l);
    Stream <List<String>>list=Stream.of(ar);
    Object[] arr=list.toArray();
    System.out.println(Arrays.toString(arr));
    }
    
}
// output
// 4
//[[abc,def,ghi,jkl]]
