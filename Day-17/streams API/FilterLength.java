import java.util.ArrayList;

public class FilterLength {
    public static void main(String[] args){
        ArrayList<String>ar=new ArrayList<String>();
        ar.add("viritha");
        ar.add("suchithra");
        ar.add("sindhu");
        ar.add("sulochna");
        ar.add("sravs");
        ar.add("sreya");
        ar.add("bindhu");
ar.stream().filter(e->e.length()>5).forEach(System.out::println);
    }
}
/* 
output
PS C:\exercise\Assignments\100-programms> java Prgm3
viritha
suchithra
sindhu
sulochna
bindhu
*/