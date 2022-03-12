import java.util.*;
public class Ipv4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
        if(str.matches(regex)){
            System.out.println("IPV4 is valid");
        }
        else{
            System.out.println("IPV4 is invalid");
        }
        sc.close();

    }
}
/*
output
PS C:\exercise\Assignments\Day-16> java Ipv4      
23.456.78.9
IPV4 is valid
PS C:\exercise\Assignments\Day-16> java Ipv4
234.56.778.9876
IPV4 is invalid
*/
