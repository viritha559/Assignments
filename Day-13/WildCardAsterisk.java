// program for regex pattern with basic set and asterisk combination(.*)
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class WildCardAsterisk{
    public static void main(String[] args){
        final String REGEX_PATTERN="foo.*bar";
        Pattern r=Pattern.compile(REGEX_PATTERN);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\exercise\\Assignments\\Day-13\\File1.txt"));
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
PS C:\exercise\Assignments\Day-13> java WildCardAsterisk      
foobar
fooabcbar
foobxcbar
foozbar
*/