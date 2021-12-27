import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i==1 || j==i ||j==n){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
    
}

// OUTPUT
// PS C:\exercise\day 6> java Patterns4      
// 5
// 1 2 3 4 5 
// 2     5
// 3   5
// 4 5
// 5    

