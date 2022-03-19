import java.util.*;
class Employee implements Comparable <Employee> {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int compareTo(Employee e) {
        return e.salary.compareTo(salary);
    }
    }
    public class ComparableExample{
        public static void main(String[] args){
            ArrayList<Employee>ar=new ArrayList<Employee>();
            Employee e1=new Employee(5,"viritha",50000.0);
            Employee e2=new Employee(4,"suchithra",60000.0);
            Employee e3=new Employee(1,"sulochana",70000.0);
            Employee e4=new Employee(2,"sravani",80000.0);
            Employee e5=new Employee(3,"sreya",90000.0);
            ar.add(e1);
            ar.add(e2);
            ar.add(e3);
            ar.add(e4);
            ar.add(e5);
            Collections.sort(ar);
            Iterator<Employee>itr=ar.iterator();
            while(itr.hasNext()){
                Employee temp=itr.next();
            
                System.out.println(temp.id+" "+temp.name+" "+temp.salary);
            }
            

        }
    }

