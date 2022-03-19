public class RandomNumber {
    public static void main(String[] args){
        int min=1;
        int max=100;
        for(int i=1;i<5;i++){
        int a=(int)(Math.random()*(max-min+1)+min);
        System.out.println("the random numbers are : "+a);
        }
    }
}
/* output 
PS C:\exercise\Assignments\Day-21> java RandomNumber      
the random numbers are : 62
the random numbers are : 57
the random numbers are : 32
the random numbers are : 90
*/

