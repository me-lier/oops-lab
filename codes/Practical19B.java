public class Practical19B {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Hello, "); sb.append("World!");
System.out.println("StringBuilder: " + sb); sb.insert(7, "Java ");
System.out.println("After insert: " + sb); sb.delete(5, 9);
System.out.println("After delete: " + sb); sb.reverse();
System.out.println("After reverse: " + sb); sb.replace(0, 3, "Hi");
System.out.println("After replace: " + sb); int length = sb.length();
System.out.println("Length of StringBuilder: " + length); int capacity = sb.capacity();
System.out.println("Capacity of StringBuilder: " + capacity); sb.ensureCapacity(20);
System.out.println("After ensuring capacity: " + sb); sb.setLength(10);
System.out.println("After setting length: " + sb);
StringBuffer sb1 = new StringBuffer("Hello, "); sb1.append("World!");
System.out.println(" StringBuffer: " + sb1);
} }