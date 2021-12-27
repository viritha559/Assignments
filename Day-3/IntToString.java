import java.util.Scanner;
public class IntToString {
    public  static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=Integer.toString(t);
        
       
       if(t==Integer.parseInt(s))
       {
        if(t>=-100 && t<=100)
        {
            System.out.println("good job");
        }
        else{
            System.out.println("wrong answer");
        }
    }
        System.out.println("interger converted to string" + s);
        sc.close();
    }


    }
    

