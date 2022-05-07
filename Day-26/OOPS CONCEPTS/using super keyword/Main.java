import java.util.Scanner;

class Event
{
 String name;
 String details;
 String type;
 String organiserName;
  public Event()
  {
  }
  public Event(String name, String details, String type, String organiserName)
  {
    this.name=name;
    this.details=details;
    this.type=type;
    this.organiserName=organiserName;
  }
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getOrganiserName() {
	return organiserName;
}
public void setOrganiserName(String organiserName) {
	this.organiserName = organiserName;

}
}
class StageEvent extends Event
{
  int noOfSeats;
  public StageEvent()
   {
  }


  public StageEvent(String name, String details, String type, String organiserName, int noOfSeats)  
  {
    super.name=name;
    super.details=details;
    super.type=type;
    super.organiserName=organiserName;
    this.noOfSeats=noOfSeats;
  }
  public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
 }
 }

 class Exhibition extends Event
{
          int noOfStalls;
            public Exhibition()
           {
             }
   public Exhibition(String name, String details, String type, String organiserName, int noOfStalls)  
    {
    super.name=name;
    super.details=details;
    super.type=type;
    super.organiserName=organiserName;
    this.noOfStalls=noOfStalls;
  }
   public int getNoOfStalls() {
	return noOfStalls;
 }
 public void setNoOfStalls(int noOfStalls) {
	this.noOfStalls = noOfStalls;
 
  }
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.StageEvent\n2.Exhibition\n3.Invalid");
    System.out.println("choose the option");
     int n = sc.nextInt();
   switch(n)
  {

   case 1:
  
    StageEvent se = new StageEvent("viritha","marriage","destination wedding","suchithra",9);
   System.out.println(se.name);
   System.out.println(se.details);
   System.out.println(se.type);
   System.out.println(se.organiserName);
   System.out.println(se.noOfSeats);
   break;
   case 2:
   Exhibition ex = new Exhibition("shreya","marriage","Hindu Style wedding","sindhu",9);
   System.out.println(ex.name);
   System.out.println(ex.details);
   System.out.println(ex.type);
   System.out.println(ex.organiserName);
   System.out.println(ex.noOfStalls);
   break;
   case 3:
    System.out.println("Invalid Input");
    break;


   }
   sc.close();
}
}
/* 
output:
-------
1.StageEvent
2.Exhibition
3.Invalid
choose the option
3.Invalid
choose the option
1
viritha
marriage
destination wedding
suchithra
9
*/



