interface Trade{
    int data=10500;
    void firstDay();
    void secondDay();
    void thirdDay();
}
public class People implements Trade{
    public void firstDay(){
         int data1=(int) (data/3.5);
        System.out.println("pepole attended on day 1 is  : " +data1);
    }
    public void secondDay(){
        int data2=(int)(data/3.5*2);
        System.out.println("people attended on day 2 is : " + data2);
    }
    public void thirdDay(){
        int data3=(int)(data/3.5/2);
        System.out.println("people attended on day 3 is : " + data3);

    }
   
    public static void main(String[] args){
        People p=new People();
        p.firstDay();
        p.secondDay();
        p.thirdDay();
    }
  
}
/* output 
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\Trade Fair> java People      
pepole attended on day 1 is  : 3000
people attended on day 2 is : 6000
people attended on day 3 is : 1500
*/