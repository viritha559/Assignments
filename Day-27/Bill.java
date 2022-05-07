import java.util.*;
class BasicCustomer{
    String name;
    String city;
    int age;
    String gender;
    int billAmount;
    int customer;
    int cashback=0;
    public void CustomerDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer name : " );
        name=sc.nextLine();
        System.out.println("enter city  : " );
       city=sc.nextLine();
       System.out.println("enter age : " );
       age=sc.nextInt();
       sc.nextLine();
       System.out.println("enter gender : " );
       gender=sc.nextLine();
       System.out.println("enter billamount: " );
       billAmount=sc.nextInt();
       System.out.println("enter customer type 1 or 0 " );
       customer=sc.nextInt();
       sc.close();

    }
public void calculateDiscount(){
    System.out.println("customer name  : " +name );
    System.out.println("customer city  : " +city ); 
    System.out.println("customer age  : " +age );
    System.out.println("customer gender  : " +gender );
    System.out.println("customer billAmount  : " +billAmount );
    System.out.println("customer type  : " +customer );

    if(customer==0){
        if(billAmount>=1 && billAmount<=4999){
            cashback=cashback+100;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=5000 && billAmount<=7999){
            cashback=cashback+250;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=7500 && billAmount<=9999){
            cashback=cashback+500;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=10000 && billAmount<=19999){
            cashback=cashback+750;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=20000 && billAmount<=29999){
            cashback=cashback+1000;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=30000){
            cashback=cashback+1500;
            System.out.println("cashback amnt: " +cashback);
        }
    }
    else if(customer == 1){
          if(billAmount>=1 && billAmount<=4999){
            cashback=cashback+200;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=5000 && billAmount<=7999){
            cashback=cashback+400;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=7500 && billAmount<=9999){
            cashback=cashback+700;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=10000 && billAmount<=19999){
            cashback=cashback+1000;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=20000 && billAmount<=29999){
            cashback=cashback+1500;
            System.out.println("cashback amnt: " +cashback);
        }
        else if(billAmount>=300000){
            cashback=cashback+2000;
            System.out.println("cashback amnt: " +cashback);
        }
    }
}
}
public class Bill extends BasicCustomer{
    public static void main(String[] args){
       Bill b=new Bill();
       b.CustomerDetails();
       b.calculateDiscount();
    }
    
}


/* output 
PS C:\exercise\Assignments\Day-27> java Bill      
enter customer name : 
Joey
enter city  : 
cbe
enter age : 
3
enter gender : 
male
enter billamount: 
Joey
enter city  :
cbe
enter age :
3
enter gender :
male
enter billamount:
2000
enter customer type 1 or 0
1
customer name  : Joey
customer city  : cbe
customer age  : 3
customer gender  : male
customer billAmount  : 2000
customer type  : 1
cashback amnt: 200
*/