class ExceptionGettingSituation { public static void main(String[] args) {
int a = 10; int b = 0; int res = a/b;
} }
public class ExceptionHandling {
public static void main(String[] args) {
try
{
System.out.println("From Try Block "); int res = 10 / 0; System.out.println(res);
}
catch (ArithmeticException ae) {
System.out.println("Exception Got Handled From the Catch Block");
}
System.out.println("Normal flow of execution is continues");
} }