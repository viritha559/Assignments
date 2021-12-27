import java.util.*;
public class Parallelogram {
    static int B,H;
    static{
    Scanner sc=new Scanner(System.in);
     B=sc.nextInt();
    H=sc.nextInt();
    sc.close();
    }
public static void main(String[] args)
{
    try{
    if(B>=-100 && B<=100)
    {
        if(H>=-100 && H<=100)
        {
            System.out.println(+(B*H));
        }
    }
}
        catch (Exception E){
            System.out.println("java.lang.exception");
            throw E;
        }
    }
}






