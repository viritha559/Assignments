// program for regex with character class ( [] )
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CharacterClass{
    public static void main(String[] args){
        Pattern r=Pattern.compile("[fcl]oo");
        Pattern r1=Pattern.compile("[fcdplb]oo");
        Pattern r2=Pattern.compile("[^mh]oo");
        Pattern r3=Pattern.compile("[j-m]oo");
        Pattern r4=Pattern.compile("[j-mz]oo");
        Pattern r5=Pattern.compile("[j-mJ-Mz]oo");


        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\exercise\\Assignments\\Day-13\\File3.txt"));
            String line;
            while((line=br.readLine())!=null){
                Matcher m=r.matcher(line);
                Matcher m1=r1.matcher(line);
                Matcher m2=r2.matcher(line);
                Matcher m3=r3.matcher(line);
                Matcher m4=r4.matcher(line);
                Matcher m5=r5.matcher(line);
                
                if(m.find())
                System.out.println(line);

                if(m1.find())
                System.out.println(line);

                if(m2.find())
                System.out.println(line);

                if(m3.find())
                System.out.println(line);

                if(m4.find())
                System.out.println(line);

                if(m5.find())
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
PS C:\exercise\Assignments\Day-13> java CharacterClass      
foo 
foo 
foo
moo
moo
moo
coo
coo
coo
doo
doo
poo
poo
loo
loo
loo
loo
loo
loo
boo
boo
*/