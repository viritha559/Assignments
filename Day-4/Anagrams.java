import java.util.*;
public class Anagrams {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean status=true;
        if(s1.length()!=s2.length()){
            status=false;
        }

        else{
            char[] ArrayS1=s1.toLowerCase().toCharArray();
            char[] ArrayS2=s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status=Arrays.equals(ArrayS1,ArrayS2);
        }
        if(status){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
        
        sc.close();
        
    }
    
}
