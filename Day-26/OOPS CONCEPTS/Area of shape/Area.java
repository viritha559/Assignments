import java.util.Scanner;

class Shape{
    double area;
    protected double radius;
    protected double length;
    protected double breadth;
    protected double base;
    protected double height;
    Shape(double radius,double length,double breadth,double base,double heigth){
               this.radius = radius;
               this.length = length;
               this.breadth = breadth;
               this.base = base;
               this.height = heigth;
    }
    public void computeArea(){

    }
}
class circle extends Shape{
    circle(double radius){
        super(radius,0,0,0,0);
    }
    public void computeArea(){
        area=22/7*radius*radius;
        System.out.println("area of the circle " + area);
    }
}
class rectangle extends Shape{
    rectangle(double length,double breadth){
        super(0,length,breadth,0,0);
    }
    public void computeArea(){
        area=length*breadth;
        System.out.println("area of the rectangle " + area);
    }
}
class triangle extends Shape{
    triangle(double base,double height){
        super(0,0,0,base,height);
    }
    public void computeArea(){
        area=0.5*base*height;
        System.out.println("area of the triangle " + area);
    }
}

public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius=0;
        double length=0;
        double breadth=0;
        double base=0;
        double height=0;

        int n;
        Shape s=null;
       Area area=new Area();
       do{
           System.out.println("\n1.circle"+"\n 2.rectangle"+"\n 3.triangle"+"\n 4.exit"+"\n enter ur choice");
         n=sc.nextInt();
         switch(n){
             case 1 :
             System.out.println("enter radius of circle " );
             radius=sc.nextDouble();
             s=new circle(radius);
             area.computeArea();
             break;

             case 2:
                 System.out.println("Enter length of rectangle: ");
                  length=sc.nextDouble();
                 System.out.println("enter breadth of rectangle: ");
                  breadth=sc.nextDouble();
                  s=new rectangle(length,breadth);
                  area.computeArea();
                 break;
             case 3:
                 System.out.println("Enter base of triangle: ");
                  base=sc.nextDouble();
                 System.out.println("enter height of triangle: ");
                  height=sc.nextDouble();
                  s=new triangle(base,height);
                  area.computeArea();
                 break;
             case 4:
                 System.out.println("exit");
         }
         s.computeArea();
       }
       while(n!=4);
    }

    private void computeArea() {
    }

    
}
/* 
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\Area of shape> java Area      

1.circle
 2.rectangle
 3.triangle
 4.exit
 enter ur choice
1
enter radius of circle 
2
area of the circle 12.0

1.circle
 2.rectangle
 3.triangle
 4.exit
 enter ur choice
3
Enter base of triangle: 
4
enter height of triangle: 
3
area of the triangle 6.0

1.circle
 2.rectangle
 3.triangle
 4.exit
 enter ur choice
2
Enter length of rectangle: 
3
enter breadth of rectangle: 
4
area of the rectangle 12.0

1.circle
 2.rectangle
 3.triangle
 4.exit
 enter ur choice
4
exit
area of the rectangle 12.0
*/