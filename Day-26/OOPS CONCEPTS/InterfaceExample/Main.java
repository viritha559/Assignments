interface MyInterface{
    int data=10;
    void display();
}
 class Main implements MyInterface{
     public void display(){
     System.out.println("interface test");
     }
     public static void main(String[] args){
         Main m=new Main();
         m.display();
         System.out.println(data);
     }
 }