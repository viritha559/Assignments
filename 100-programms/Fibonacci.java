import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            sc.close();
        }
    } 
}
// output
// PS C:\exercise\100programms> java Fibonacci      
// 5
// 0 1 1 2 3 
