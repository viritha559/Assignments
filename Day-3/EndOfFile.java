import java.util.*;
public class EndOfFile {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int i=1;
        while(sc.hasNextLine())
       { 
           String s1 = sc.nextLine();

           System.out.println(i+ " " +s1);
           i++;
           
        
    }
        sc.close();
    }
}
