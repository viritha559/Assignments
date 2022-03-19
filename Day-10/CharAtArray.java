import java.util.Scanner;
public class CharAtArray{
    public static void main(String args[]){
        int x=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
        char Alphabets[]=new char[str.length()];
        Alphabets[x]=str.charAt(i);
        x++;
        System.out.println(i+"-"+Alphabets[i]);
        sc.close();

        }

    }
}
/* 
output
PS C:\exercise\Assignments\Day-10> java CharAtArray      
Viritha
0-V
1-i
2-r
3-i
4-t
5-h
6-a
*/