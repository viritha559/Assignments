import java.io.*;
public class File{
    public static void method()throws FileNotFoundException{

        FileReader file=new FileReader("C:\\Users\\virit\\OneDrive\\Documents\\javaclass\\object.txt");
        BufferedReader fileinput=new BufferedReader(file);
        throw new FileNotFoundException();
    }
 public static void main(String[] args){
     try{
         method();
     }
     catch(FileNotFoundException e){
         e.printStackTrace();
     }
     System.out.println("rest of the code .....");
 }

}
/*
output
PS C:\exercise\Assignments\Day-11> java File
java.io.FileNotFoundException
        at File.method(File.java:7)
        at File.main(File.java:11)
rest of the code .....
*/