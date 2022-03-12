import java.io.*;
import java.util.regex.*;
public class FileExtensions {
    public static void main(String[] args){
        Pattern r=Pattern.compile("\\.pdf");
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\exercise\\Assignments\\Day-16\\ExtensionsFile.txt"));
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
PS C:\exercise\Assignments\Day-16> java FileExtensions      
Github.pdf
joins.pdf
*/
