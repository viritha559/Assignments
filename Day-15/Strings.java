import java.util.*;
interface MyInterface{
    public static void move(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String low="";
        String upr="";
        int len=str.length();
        char ch;
        for(int i=0;i<len;i++){
            ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upr=upr+ch;
            }
            else{
                low=low+ch;
            }
        }
        sc.close();
        String result=low+upr;
        System.out.println(result);
        return;
    }
}
public class Strings  implements MyInterface {
    public static void move(){

    }
    public static void main(String[] args) {
        MyInterface.move();
    }

    
}
/* 
output
PS C:\exercise\Assignments\Day-15> java Strings      
REasonBehInd
asonehndREBI
*/