import java.util.Scanner;
 class Solution {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n=A.length()+B.length();
        System.out.println(n);
        int c=A.compareTo(B);

        if(c>0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" ");
        System.out.println(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase()+" ");
        sc.close();

    }
    
}
