import java.util.*;
public class Days {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input a month no. : ");
        int month=sc.nextInt();
        System.out.println("input a year : ");
        int year=sc.nextInt();
        int numberofdays=0;
        String monthname="unknown";
        switch(month) {
            case 1 :
                          monthname="january";
                          numberofdays=31;
                          break;
            case 2 :
                          monthname="febuary";
                          if((year%400==0) || ((year % 4==0) && (year %100 !=0))){
                              numberofdays=29;
                          }
                          else{
                          numberofdays=28;
                          }
                          break;
            case 3 :
                          monthname="march";
                          numberofdays=31;
                          break;
          case 4 :
                          monthname="april";
                          numberofdays=30;
                          break;
         case 5 :
                          monthname="may";
                          numberofdays=31;
                          break;
         case 6 :
                          monthname="june";
                          numberofdays=30;
                          break;
         case 7 :
                          monthname="july";
                          numberofdays=31;
                          break;
         case 8 :
                          monthname="august";
                          numberofdays=31;
                          break;
         case 9 :
                          monthname="september";
                          numberofdays=30;
                          break;
         case 10 :
                          monthname="october";
                          numberofdays=31;
                          break;
         case 11 :
                          monthname="november";
                          numberofdays=30;
                          break;
         case 12 :
                          monthname="december";
                          numberofdays=31;
                          break;
        }
        System.out.println(monthname + "  " + year + " has " + numberofdays + " days\n ");
        sc.close();
    }
    
}
/* output 

PS C:\exercise\Assignments\Day-20> java Days      
input a month no. : 
2
input a year : 
2014
febuary  2014 has 28 days

*/
