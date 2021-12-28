import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch == str.charAt(i)){
                count ++;
            }
        }
        
        if(count > 0){
            System.out.println("the frequency is : "+count);
        }
        else{
            System.out.println(" their is no charecter in the string");
        }
        
        sc.close();
    }
}
// output
// PS C:\exercise\100programms> java Count
// viritha
// i
// the frequency is : 2

