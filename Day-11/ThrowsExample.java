import java.io.*;
public class ThrowsExample {
   void msg(){
       System.out.println("parent method");
   }    
}
public class TestExceptionChild extends ThrowsExample{
    void msg() throws IOException{
        System.out.println("test exception child");
    }
    public static void main(String[] args){
        ThrowsExample t=new TestExceptionChild();
        t.msg();
    }
}
/*
output
PS C:\exercise\Assignments\Day-11> javac ThrowsExample.java
ThrowsExample.java:7: error: class TestExceptionChild is public, should be declared in a file named TestExceptionChild.java
public class TestExceptionChild extends ThrowsExample{
       ^
ThrowsExample.java:8: error: msg() in TestExceptionChild cannot override msg() in ThrowsExample
    void msg() throws IOException{
         ^
  overridden method does not throw IOException
2 errors
*/
