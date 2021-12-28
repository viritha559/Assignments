import java.util.Scanner;
public class Pattern12 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int temp=1;
    for(int i=n;i>=1;i--){
        for(int k=n-1;k>=1;k--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print(temp+" ");

        temp++;
        }
System.out.println();
    }
    sc.close();
}    
}
