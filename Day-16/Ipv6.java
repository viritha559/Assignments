import java.util.*;
public class Ipv6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
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
PS C:\exercise\Assignments\Day-16> java Ipv6      
23.456.77.33.1.34
IPV4 is valid
PS C:\exercise\Assignments\Day-16> java Ipv6
12.3.445.56.789.5.5
IPV4 is invalid
*/