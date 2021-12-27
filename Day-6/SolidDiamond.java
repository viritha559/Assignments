import java.util.Scanner;
public class SolidDiamond {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
          for(int j=i;j<=n;j++){
              System.out.print(" ");
          }
          for(int k=1;k<=i;k++){
              System.out.print("* ");
          }
          System.out.println();
      }
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print(" ");
          }
          for(int k=n;k>=i;k--){
              System.out.print("* ");
          }
          System.out.println();
      }
    sc.close();
  }  
}

// OUT PUT      
// PS C:\exercise\day 9> java SolidDiamond     
// 5
//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *