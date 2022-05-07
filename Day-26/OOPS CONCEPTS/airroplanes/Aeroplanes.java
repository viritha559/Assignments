interface AirFair {
	double calculateAmount();

}
 class AirIndia  implements AirFair{
	int hours;
	double costperHours;
	public AirIndia(int hours, double costperHours) {
		super();
		this.hours = hours;
		this.costperHours = costperHours;
	}
	public AirIndia() {
		
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostperHours() {
		return costperHours;
	}
	public void setCostperHours(double costperHours) {
		this.costperHours = costperHours;
	}
public double calculateAmount() {
		double	result1=hours*costperHours*2;
		System.out.println("The AirIndia cost is: "+result1);
		return result1;
}
}
 class Indigo implements AirFair {
	int hours;
	double costperHours;

	public Indigo(int hours, double costperHours) {
		super();
		this.hours = hours;
		this.costperHours = costperHours;
	}

	public Indigo() {

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostperHours() {
		return costperHours;
	}

	public void setCostperHours(double costperHours) {
		this.costperHours = costperHours;
	}
	public double calculateAmount() {
		 double result2= hours*costperHours*4;
		 System.out.println("The Indigo cost is: "+result2);
		 return result2;
	}	
}


 class Kingfisher implements AirFair {
	int hours;
	double costperHours;
	public Kingfisher(int hours, double costperHours) {
		
		this.hours = hours;
		this.costperHours = costperHours;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostperHours() {
		return costperHours;
	}
	public void setCostperHours(double costperHours) {
		this.costperHours = costperHours;
	}
	public Kingfisher(){
	
	}
	
	public double calculateAmount() {
		double result3= hours*costperHours;
		System.out.println("The Kingfisher cost is: "+result3);
		return result3;
	}
	
}
public class Aeroplanes {

	public static void main(String[] args) {
		AirIndia ar=new AirIndia(2,4);
		ar.calculateAmount();
		Kingfisher kg=new Kingfisher(2,2);
		kg.calculateAmount();
		Indigo i=new Indigo(2,2);
		i.calculateAmount();

	}

}
/* output 
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\airroplanes> java Aeroplanes      
The AirIndia cost is: 16.0
The Kingfisher cost is: 4.0
The Indigo cost is: 16.0
*/
