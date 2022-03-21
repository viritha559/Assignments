import java.util.*;
public class ColourName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 1 :
                    System.out.println("the colour is pink");
                    break;
           case 2 :
                    System.out.println("the colour is blue");
                    break;
           case 3 :
                    System.out.println("the colour is green");
                    break;
          case 4 :
                    System.out.println("the colour is black");
                    break;
        case 5:
                    System.out.println("the colour is red");
                    break;
        case 6 :
                    System.out.println("the colour is white");
                    break;
        case 7 :
                    System.out.println("the colour is yellow");
                    break;
        case 8 :
                    System.out.println("the colour is voilet");
                    break;
        default:
        System.out.println("enterd colour is not in the list");
        }
        sc.close();
    }
    
}
/* output 
PS C:\exercise\Assignments\Day-21> java ColourName      
4
the colour is black
PS C:\exercise\Assignments\Day-21> java ColourName
9
enterd colour is not in the list
*/
