import java.util.*;
public class ReversingNumber {
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
PS C:\exercise\Assignments\Day-27> java ReversingNumber      
234567
reverse number :765432
*/