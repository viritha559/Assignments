import java.util.Scanner;
class Patterns1
{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
             System.out.print(j+" ");
         }
         System.out.println();
     }
     sc.close();
    }
}



// OUTPUT :

// PS C:\exercise\day 6> java Patterns1      
// 5
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5