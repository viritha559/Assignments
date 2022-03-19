import java.util.*;
public class Filter {
    public static void main(String[] args){
        ArrayList<String>ar=new ArrayList<String>();
        ar.add("naveen");
        ar.add("warren");
        ar.add("eklonmusk");
        ar.stream().map(e->e.toUpperCase()).map(e->e.substring(0,3)).filter(e->(e.startsWith("W"))).forEach(System.out::println);
    
    }
}
// output
// WAR