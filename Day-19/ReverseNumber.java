import java.util.*;
public class ReverseNumber {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int reverse=0;
      while(n!=0){
          int remainder=n%10;
          reverse=reverse*10+remainder;
          n=n/10;
      }
      System.out.println("reverse number :" +reverse);
      sc.close();
  }  
}
/* output 
PS C:\exercise\Assignments\Day-19> java ReverseNumber      
68642
reverse number :24686
*/
