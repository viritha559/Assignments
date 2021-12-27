import java.util.*;
public class Palindrome{

    public static void main(String[] args)
        {
        String a,b="";
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        int n=a.length();
        for(int i=n-1;i>=0;i--){
            b=b+a.charAt(i);
            sc.close();

        }
    if(a.equalsIgnoreCase(b)){
        System.out.println("yes");

    }
    else{
        System.out.println("no");
    }
}
}
    



    

  









   
    

