import java.util.Scanner;
 class Employee {
    String name;
    int id;
    String designation;

    public Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
    }
    }
    public  class Test{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(" the no.of employees are : "+n);
    Employee arr[]=new Employee[n];
    for(int i=0;i<n;i++){
        System.out.println(" enter id :");
        int id=sc.nextInt();
        System.out.println(" enter name :");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("enter designation");
        String designation=sc.nextLine();

        Employee e=new Employee(name, id, designation);
        arr[i]=e;
    }
    System.out.println("enter the id to search :");
    int search=sc.nextInt();
    for(Employee e: arr){
      if(e.id == search){
          System.out.println("match found");
          System.out.println("employee name : "+e.name);
          System.out.println("employee id : "+e.id);
          System.out.println("employee designation: "+e.designation);
      }



    }
sc.close();
    }
}
/*
output
PS C:\exercise\100programms> java Test
3
 the no.of employees are : 3
 enter id :
559
 enter name :
viritha
enter designation
student
 enter id :
528
 enter name :
suchithra
enter designation
student
 enter id :

423
 enter name :
shreya
enter designation
student
enter the id to search :
559
match found
employee name : viritha
employee id : 559
employee designation: student
*/    


    

    

