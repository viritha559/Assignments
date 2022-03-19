import java.util.*;
public class Season {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        String season=sc.nextLine();
        switch(month){
            case 1 : 
            case 2 : 
            case 12 : 
            season="winter";
            break;
                   
            case 3 : 
            case 4 : 
            case 5 : 
            season="spring";
            break;
                   
            case 6 : 
            case 7 : 
            case 8 : 
            season="summer";
            break;
                   
            case 9 : 
            case 10 : 
            case 11 : 
            season="autumn";
            break;
            default : 
            season ="bogus month";
                   
        }
        System.out.println(season);
        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-21>
spring
PS C:\exercise\Assignments\Day-21> java Season
15
bogus month
*/
