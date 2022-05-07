import java.util.*;
public class Denomination {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        int amount=sc.nextInt();
        int r500=0, r100=0, r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
          
       while(amount>500){
           r500=amount/500;
           amount=amount%500;
           System.out.println("500 = " +r500);
           break;
       }

       while(amount>100){
        r100=amount/100;
        amount=amount%100;
        System.out.println("100 = " +r100);
        break;
    }

    while(amount>50){
        r50=amount/50;
        amount=amount%50;
        System.out.println("50 = " +r50);
        break;
    }

    while(amount>20){
        r20=amount/20;
        amount=amount%20;
        System.out.println("20 = " +r20);
        break;
    }

    while(amount>10){
        r10=amount/10;
        amount=amount%10;
        System.out.println("10 = " +r10);
        break;
    }

    while(amount>5){
        r5=amount/5;
        amount=amount%5;
        System.out.println("5 = " +r5);
        break;
    }

    while(amount>2){
        r2=amount/2;
        amount=amount%2;
        System.out.println("2 = " +r2);
        break;
    }
    while(amount>=1){
        r1=amount/1;
        amount=amount%1;
        System.out.println("1 = " +r1);
        break;
    }

    sc.close();
    }

    
}
/* output 
PS C:\exercise\Assignments\Day-27> java Denomination      
enter amount
2888
50 = 1
20 = 1
10 = 1
5 = 1
2 = 1
1 = 1
*/
