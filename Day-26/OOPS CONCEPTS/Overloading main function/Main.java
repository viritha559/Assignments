class Main{
    public void main(String str1){
        System.out.println(" this is the first string " + str1);
    }
    public void main(String str2,String str3){
        System.out.println(" this main method contains two strings " + str2 + " and " + str3);
    }
    public static void main(String[] args){
        System.out.println("we are in interface");
    Main m=new Main();
    m.main("viritha");
    m.main("varma","kanumuri");
    }


}
/* output 
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\Overloading main function> java Main      
we are in interface
 this is the first string viritha
 this main method contains two strings varma and kanumuri
 */