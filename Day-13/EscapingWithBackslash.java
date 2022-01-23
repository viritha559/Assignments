// program for regex pattern with escaping with backslash
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EscapingWithBackslash {
    public static void main(String[] args){
        Pattern r=Pattern.compile("x[#:\\^]y");
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\exercise\\Assignments\\Day-13\\File.txt"));
            String line;
            while((line=br.readLine())!=null){
                Matcher m=r.matcher(line);
                if(m.find())
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
/* 
output
PS C:\exercise\Assignments\Day-13> java EscapingWithBackslash      
x#y
x:y
x^y
*/