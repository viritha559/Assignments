
public class DivisibleBy7 {
    public static void main(String[] args){
    int sum=0;
    for(int i=100;i<=200;i++){
      if(i%7==0){
                sum=sum+i;
       
       System.out.println ("the divisible numbers are : " +i);
    }
}
System.out.println("sum of no.s divisible by 7 are : "+ sum);
    }
}
/* output 
PS C:\exercise\Assignments\Day-21> java DivisibleBy7      
the divisible numbers are : 105
the divisible numbers are : 112
the divisible numbers are : 119
the divisible numbers are : 126
the divisible numbers are : 133
the divisible numbers are : 140
the divisible numbers are : 147
the divisible numbers are : 154
the divisible numbers are : 161
the divisible numbers are : 168
the divisible numbers are : 175
the divisible numbers are : 182
the divisible numbers are : 189
the divisible numbers are : 196
sum of no.s divisible by 7 are : 2107
*/
