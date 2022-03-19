class Customer{
    int customerid;
    String customername;
    static int counter=0;
    Customer(String custname){
        this.customername=customername;
        this.customerid=counter;
        Customer.counter+=2;

    }
    public static void updateCounter(int val){
        Customer.counter=val;

    }
}
class RegularCustomer extends Customer{
    int discount;
    RegularCustomer(String custname,int discount){
        super(custname);
        this.discount=discount;

    }
    public static void updateCounter(int val){
        Customer.counter=val+100;
    }
}
    class Demo{
        public static void main(String args[]){
            Customer custobj1=new Customer("Robert");
            Customer custobj2=new RegularCustomer("Bella",5);
            custobj2.updateCounter(500);
            Customer custobj3=new Customer("mary");
            System.out.println(custobj3.customerid);

        }
    }

