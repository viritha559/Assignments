public class ConcatenateString {
    public static void main(String[] args){
        String str[]={"viritha","varma","kanumuri"};
        String str1=new String();
        for(int i=0;i<str.length;i++){
           str1=str1+str[i];
        }
        System.out.println(str1);
    }
}
/* output
PS C:\exercise\Assignments\Day-21> java ConcatenateString      
virithavarmakanumuri
*/
