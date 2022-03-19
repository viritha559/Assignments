import java.util.*;
public class Recursionfactorial {
  static int factorial(int n){
      if(n==0) 
           return 1;
      else
           return(n*factorial(n-1));
  } 
  public static void main(String[] args){
      int  fact=1;
      Scanner sc = new Scanner(System.in);
      int number=sc.nextInt();
      fact=factorial(number);
      System.out.println("factorial of "+number+"is : "+fact);
      sc.close();
  } 
}
/* output 
PS C:\exercise\Assignments\Day-21> java Recursionfactorial      
5
factorial of 5is : 120
PS C:\exercise\Assignments\Day-21> java Recursionfactorial
0
factorial of 0is : 1
*/
