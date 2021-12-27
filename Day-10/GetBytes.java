import java.util.Scanner;
import java.io.UnsupportedEncodingException;
public class GetBytes {
    public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        byte[] b=str1.getBytes();// get ascii value of string
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        String str2=new String(b);// get back string
        System.out.println(str2);
        byte[] byteArr=str1.getBytes("UTF-16");// unicode transformation
        for(int j=0;j<byteArr.length;j++){
        System.out.print(byteArr[j]);
        }
        sc.close();
    }
    
}
// output
// PS C:\exercise\day 10> java GetBytes      
// viritha
// 118
// 105
// 114
// 105
// 116
// 104
// 97
// viritha
// -2-1011801050114010501160104097
