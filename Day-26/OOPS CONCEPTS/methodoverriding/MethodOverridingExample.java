class Animal{
    void print(){
        System.out.println("this ia animal");
    }
}
class Dog extends Animal{
void print(){
    System.out.println("this animal is dog");
}
}
class Cat extends Dog{
    void print(){
        System.out.println("this is cat");
    }
}

public class MethodOverridingExample extends Cat {
    public static void main(String[] args){

 MethodOverridingExample mov=new  MethodOverridingExample();
 mov.print();
    }
    
}

// output
// this ia a cat
