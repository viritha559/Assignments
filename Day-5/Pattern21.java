import java.util.Scanner;
class Pattern21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        
        
        System.out.println();
        }
    
    sc.close();
}
}
// output
// PS C:\exercise\day 5> java Pattern21            
// 5
//     1 
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5
