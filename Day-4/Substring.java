import java.util.Scanner;
public class Substring {
   static  int n;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start =sc.nextInt();
        int end=sc.nextInt();
        System.out.println(s.substring(start,end));
        sc.close();

    }
    
}
