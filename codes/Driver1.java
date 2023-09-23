interface I1 {
public void m1(); }
interface I2 { public void m1();
}
public class Driver1 implements I1, I2 {
public void m1() {
System.out.println("From M1() of Class I1"); }
public static void main(String[] args)
{
    Driver1 d1=new Driver1();
    d1.m1();
}}