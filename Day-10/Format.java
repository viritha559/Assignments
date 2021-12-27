public class Format {
    public static void main(String[] args){
        String name=" java ";
        String str1=String.format("name is %s",name);
        String str2=String.format("value is %f",32.33434);
        String str3=String.format("value is %32.12f",32.33434);
        String str4=String.format("%d",101);
        String str5=String.format("%s","python");
        String str6=String.format("%f",101.00);
        String str7=String.format("%x",101);
        String str8=String.format("%c",'c');
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
    }
    
}