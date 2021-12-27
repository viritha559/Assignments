import java.util.Scanner;
public class ConditionalCheck
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        sc.close();
    
            if(num%2==0)
            {
                if(num>=6 && num<=20)
                {
                    System.out.println("weird");
                }     
            else
            {
            System.out.println("not weired");
            }
        }
            else
            {
                System.out.println("not weired");
            }
    }
}
    
// output
// PS C:\exercise\day 1> java ConditionalCheck
// enter number:
// 3
// not weired





