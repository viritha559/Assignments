import java.util.*;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=1;
        int y=sc.nextInt();
        switch(x){
            case 1:
                   switch(y){
                       case 1 :
                               System.out.println("choice is 2 ");
                               break;
                        case 2 :
                        System.out.println("choice is 3");
                        break; 
                        default:
                        System.out.println("choice enterd is not 2 or 3");
                        break;      
                   }
                   break;
            case 2 :
                 System.out.println("choice is 4");
                 break;
            case 3 :
                  System.out.println("choice is 5");
                  break;
            default :
                  System.out.println("choice is other than 1,2,3,4,5");
                  break;
        }
        sc.close();
    }
}

/* output
PS C:\exercise\Assignments\Day-21> java NestedSwitch      
1
choice is 2 
PS C:\exercise\Assignments\Day-21> java NestedSwitch
5
*/