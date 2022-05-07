interface Growing{
 void isGrowing();
}
class GrowingNumber implements Growing{
   int currentdigit,n=123;
   boolean flag=false;
   public void isGrowing(){
         currentdigit=n/10;
         n=n/10;
         while(n>0){
             if(currentdigit<=n%10){
                 flag=true;
                 break;
             }
             currentdigit=n%10;
             n=n/10;
         }
         if(flag){
             System.out.println("digits are not in increasing order");
         }
         else{
             System.out.println("digits are in increasing order");	
         }
   }
}



class GrowingString implements Growing{
    String str="ant";
    boolean flag=false;public void isGrowing(){
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>=str.charAt(i+1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("String is in not increasing order");
        }
        else{
            System.out.println("Strings are  in increasing order");
        }
    }
}
public class Main{
  public static void main(String[] args){
      GrowingNumber gn=new GrowingNumber();
      gn.isGrowing();
      GrowingString gs=new GrowingString();
      gs.isGrowing();
  }
}
/* Output
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\growing string> java Main      
digits are in increasing order
Strings are  in increasing order
*/