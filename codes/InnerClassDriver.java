class Outer {
public int outerData = 10;
public class Inner { void display() {
System.out.println("Inner class data: " + outerData); }
}
public void useInner() { Inner inner = new Inner();
        inner.display();
    }
}
public class InnerClassDriver {
public static void main(String[] args) {
Outer outer = new Outer(); outer.useInner();
} }