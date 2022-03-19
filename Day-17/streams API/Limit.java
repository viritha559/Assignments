import java.util.ArrayList;

public class Limit {
    public static void main(String[] args){
        ArrayList<String>ar=new ArrayList<String>();
        ar.add("abc");
        ar.add("def");
        ar.add("ghi");
        ar.add("jkl");
        ar.add("mno");
        ar.add("pqr");
        ar.add("stu");
ar.stream().limit(4).forEach(System.out::println);
    }
}
/* 
output
abc
def
ghi
jkl
*/
