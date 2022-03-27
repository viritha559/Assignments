import java.util.*;
public class DigitToWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r,num;
        String digitwords="";
        num=n; 
        while(num>0){
            r=num%10;
            switch(r){
                case 0 : 
                       digitwords="zero"+digitwords;
                       break;
                case 1: 
                       digitwords="one"+digitwords;
                       break;
                 case 2: 
                       digitwords="two"+digitwords;
                       break;
                 case 3 : 
                       digitwords="three"+digitwords;
                       break;
                 case 4 : 
                       digitwords="four"+digitwords;
                       break;
                 case 5 : 
                       digitwords="five"+digitwords;
                       break;
                 case 6: 
                       digitwords="six"+digitwords;
                       break;
                 case 7 : 
                       digitwords="seven"+digitwords;
                       break;
                 case 8 : 
                       digitwords="eight"+digitwords;
                       break;
                case 9 : 
                       digitwords="nine"+digitwords;
                       break;
            }
            num=num/10;
        }
        System.out.println(digitwords);
        sc.close();
    }
    
}
/* output
PS C:\exercise\Assignments\Day-24> java DigitToWord
12345
 onetwothreefourfive
 */
