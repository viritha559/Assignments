import java.util.*;
public class Equals { //case sensitive
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1.equals(str2));
        ArrayList<String> list=new ArrayList<>();
        list.add("Suchithra");
        list.add("shreya");
        list.add("sulochana");
        list.add(str1);
        for(String str:list){
            if(str.equals(str1)){
                System.out.println(str1 + "is present");
            }
        }

        System.out.println(list);
        
        
        sc.close();
    }
}
// output
// PS C:\exercise\day 10> java Equals      
// viritha
// sulochana
// false
// virithais present
// [Suchithra, shreya, sulochana, viritha]