class Parent2 {
int a;
{
System.out.println(" From MLNSI 1 of Parent class "); System.out.println(a);
a = 12;
} 
Parent2()
{
super();
System.out.println(" From Parent() constructor"); }
{
System.out.println(a);
} }
class Child2 extends Parent2 {
int b;
{
System.out.println(" From MLNSI of Child Class"); a = 7;
b = 9;
} Child2(){
    super();
System.out.println(" From child() constructor");
}}
    public class Practical14d{
public static void main(String[] args) {
    Child2 ch1 = new Child2(); 
    System.out.println(ch1.a); 
    System.out.println(ch1.b);
}}
