import java.util.*;
class SortByid implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2) {
        return e1.id-e2.id;
    }
}
 class SortByname implements Comparator<Employee>{
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    }
    class SortBysalary implements Comparator<Employee>{
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    }

class Employee implements Comparator <Employee> {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int compare(Employee o1, Employee o2) {
        return 0;
    }

   }
    public class ComparatorExample{
        public static void main(String[] args){
            ArrayList<Employee>ar=new ArrayList<Employee>();
            Employee e1=new Employee(5,"viritha",50000.0);
            Employee e2=new Employee(3,"suchithra",60000.0);
            Employee e3=new Employee(2,"sulochana",70000.0);
            Employee e4=new Employee(1,"sravani",80000.0);
            Employee e5=new Employee(4,"sreya",90000.0);
            ar.add(e1);
            ar.add(e2);
            ar.add(e3);
            ar.add(e4);
            ar.add(e5);
            SortByid sid=new SortByid();
            SortByname sname=new SortByname();
           SortBysalary ssal=new SortBysalary();


            Collections.sort(ar,sid);
            Collections.sort(ar,sname);
            Collections.sort(ar,ssal);

            Iterator<Employee>itr=ar.iterator();
            while(itr.hasNext()){
                Employee temp=(Employee)itr.next();
                System.out.println(temp.id+ " "+temp.name+" "+temp.salary);
            }
        }

        
    }


