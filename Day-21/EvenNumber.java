import java.util.*;
public class EvenNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       for(int i=1;i<=num;i++){
           int list=i%2;
       if(list==0){
        System.out.println(" the even no.s are : " +i);
       }
      
    }

        sc.close();
    }
}
/* output 
PS C:\exercise\Assignments\Day-21> java EvenNumber      
10
 the even no.s are : 2
 the even no.s are : 4
 the even no.s are : 6
 the even no.s are : 8
 the even no.s are : 10
 */
