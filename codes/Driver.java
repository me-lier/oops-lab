class Parent{
    public void m1(){
        System.out.println("From Parent Class m1()");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("From Child Class m1()");
    }
}
public class Driver{
    public static void main(String[] args) {
        Parent p1 = new Parent(); 
        p1.m1();
        Child ch1 = new Child(); 
        ch1.m1();
        Parent p2 = ch1;
        p2.m1();
        Child ch2 = (Child)p2;
        ch2.m1();
    }
}