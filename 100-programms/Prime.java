import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=0;
        int min=sc.nextInt();
        int max=sc.nextInt();
        for(int i=min;i<=max;i++){
        int count=0;
      for(num=i;num>=1;num--){
   if(i%num==0){
       count=count+1;
   }
}
    if(count==2)
    {
        System.out.println("prime numbers are "+i+" ");
    }
}            
    sc.close();
    }
}
// output
// PS C:\exercise\100programms> java Prime      
// 1
// 100
// prime numbers are 2 
// prime numbers are 3 
// prime numbers are 5 
// prime numbers are 7 
// prime numbers are 11 
// prime numbers are 13 
// prime numbers are 17 
// prime numbers are 19 
// prime numbers are 23
// prime numbers are 29
// prime numbers are 31
// prime numbers are 37
// prime numbers are 41
// prime numbers are 43
// prime numbers are 47
// prime numbers are 53
// prime numbers are 59
// prime numbers are 61
// prime numbers are 67
// prime numbers are 71
// prime numbers are 73
// prime numbers are 79
// prime numbers are 83
// prime numbers are 89
// prime numbers are 97
    

