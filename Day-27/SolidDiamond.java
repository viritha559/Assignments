import java.util.*;
 public class SolidDiamond{
 public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
 int n=sc.nextInt();
for(int i=0;i<n;i++){
  for(int j=0;j<n-i-1;j++){
      System.out.print(" ");
               }
 for(int k=0;k<2*i+1;k++){
  System.out.print("*");
     } 
  System.out.println("");  
      }
 for(int i=n-1;i>0;i--){
 for(int j=n-1;j>=i;j--){
      System.out.print(" ");
 }
for(int k=2*i-1;k>0;k--){
 System.out.print("*");
 }  
 System.out.println("");
}
 sc.close();
 }
 }

 /* output 
PS C:\exercise\Assignments\Day-27> java SolidDiamond      
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/