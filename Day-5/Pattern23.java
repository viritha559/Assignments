import java.util.Scanner;
class Pattern23{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        
        
        System.out.println();
        }
    
    sc.close();
}
}
/*
output
PS C:\exercise\day 5> java Pattern23      
5
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/
