public class Processing {
    public static void main(String[] args){
        String str= "03:12:20 sunday 19-dec-2021";
        String part[]=str.split(" ");
        String temp =part[0];
        String[] firstString=temp.split(":");
        System.out.println("hour:"+ firstString[0]);
        System.out.println("minutes:"+firstString[1]);
        System.out.println("seconds:"+firstString[2]);
        System.out.println("day :"+part[1]);
        String last=part[2];
        String segment[]=last.split("-");
        System.out.println("date :"+segment[0]);
        System.out.println("month :"+segment[1]);
        System.out.println("year :"+segment[2]);
    }    
    }
    /*
    PS C:\exercise\100programms> java Processing      
hour:03
minutes:12
seconds:20
day :sunday
date :19
month :dec
year :2021
*/
