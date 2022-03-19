import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int times=sc.nextInt();
        for(int i=1;i<=times;i++){
            int table=num*i;
            System.out.println(num+"*"+i+"="+table);
        }
        sc.close();
        
    }
}
/* output 
PS C:\exercise\Assignments\Day-21> java MultiplicationTable      
5
15
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
5*11=55
5*12=60
5*13=65
5*14=70
5*15=75
*/
