public class Practical19A {
public static void main(String[] args) {
StringBuffer sb1 = new StringBuffer("Hello, "); sb1.append("World!");
System.out.println("After append: " + sb1); sb1.insert(7, "Java ");
System.out.println("After insert: " + sb1); sb1.delete(5, 9);
System.out.println("After delete: " + sb1); sb1.reverse();
System.out.println("After reverse: " + sb1); sb1.replace(0, 6, "Hi");
System.out.println("After replace: " + sb1); int length = sb1.length();
System.out.println("Length of the buffer: " + length); int capacity = sb1.capacity();
System.out.println("Capacity of the buffer: " + capacity); sb1.ensureCapacity(20);
System.out.println("After ensuring capacity: " + sb1);
          sb1.setLength(10);
System.out.println("After setting length: " + sb1); }
}