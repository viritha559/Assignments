import java.util.*;
public class MovieRating {
    int year;
    String moviename;
    float rating;
    public MovieRating(){

    }
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter realsed year");
         year=sc.nextInt();
        System.out.println("enter movie name");
         moviename=sc.next();
        System.out.println("enter rating");
         rating=sc.nextFloat();
        sc.close();
        
    }
    public void display(){
        System.out.println(moviename);
        if(rating>=0.0 && rating <= 2.0){
            System.out.println("flop");
        }
        else if(rating >=2.1 && rating<=3.4){
                System.out.println("semi-hit");
        }
        else if(rating >=3.5 && rating<=4.5){
            System.out.println("hit");
    }
    else if(rating >=4.6 && rating<=5.0){
        System.out.println("super-hit");
    }
    }
     
    public static void main(String[] args){
    
    MovieRating mr=new MovieRating();
    mr.accept();
    mr.display();
  
    
}
    
}
/* output 
PS C:\exercise\Assignments\Day-27> java MovieRating      
enter realsed year
2004
enter movie name
abc
enter rating
2.0
abc
2004
flop
PS C:\exercise\Assignments\Day-27> java MovieRating      
enter realsed year
2008
enter movie name
xyz
enter rating
3.2
xyz
2008
semi-hit
PS C:\exercise\Assignments\Day-27> java MovieRating      
enter realsed year
2016
enter movie name
abc
enter rating
4.2
abc
2016
hit
*/