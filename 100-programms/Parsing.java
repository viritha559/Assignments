
public class Parsing {
public static void main(String[] args){
    String str= "03:12:20 sunday 19-dec-2021";
    int hour=Integer.parseInt(str.substring(0,2)); 
    int minutes=Integer.parseInt(str.substring(3,5));
    int seconds=Integer.parseInt(str.substring(6,8));
    String day=str.substring(9,15);
    int date=Integer.parseInt(str.substring(16,18));
    String month=str.substring(19,22);
    int year=Integer.parseInt(str.substring(23));
    System.out.println("hour : "+ hour);
    System.out.println("minutes : "+minutes);
    System.out.println("seconds : "+seconds);
    System.out.println("day : "+day);
    System.out.println("date : "+date);
    System.out.println("month : "+month);
    System.out.println(" year : "+year);
}    
}
// output
// PS C:\exercise\100programms> java Parsing      
// hour : 3
// minutes : 12
// seconds : 20
// day : sunday
// date : 19
// month : dec
// year : 2021