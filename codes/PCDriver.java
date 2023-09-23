class Parent1{
    public void test(){
        System.out.println("From Parent Class test()");
    }
}
class Child1 extends Parent1{
    public void test(){
        System.out.println("From Child Class test()");
    }
}
public class PCDriver{
    public static void main(String[] args) {
        Parent1 p1 = new Parent1(); 
        p1.test();// From Parent Class test()
        Child1 ch1 = new Child1(); 
        ch1.test();// From Child Class test()
          Parent1 p2 = ch1;// Upcasting
          p2.test();// From Child class test()
          Child1 ch2 = (Child1)ch1;// Downcasting
          ch2.test();// From child class test()
Parent1 p3 = new Child1(); p3.test();// From Child Class test()
} }