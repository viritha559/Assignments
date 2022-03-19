import java.util.*;
public class VowelsConsonents {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int vowels=0;
    int consonents=0;
    String str=sc.nextLine().toLowerCase();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
            vowels++;
        }
        else{
            consonents++;
        }
    }
        System.out.println(" no. of vowels are : "+vowels);
        System.out.println("no. of consonents are :"+consonents);
        sc.close();
    
    }
}
/* output 
PS C:\exercise\Assignments\Day-19> java VowelsConsonents      
Ashoka College Of Enginnering For Women
 no. of vowels are : 14
no. of consonents are :25
*/