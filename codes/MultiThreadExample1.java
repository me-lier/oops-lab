class NumberPrinter1 implements Runnable
{
public int end;
public int start;
public NumberPrinter1(int start, int end)
{
this.start = start;
this.end = end; }
@Override
public void run()
{
for (int i = start; i <= end; i++)
{
System.out.println(Thread.currentThread().getName() + ": " + i);
} }
}
public class MultiThreadExample1
{
    public static void main(String[] args) {
        // Create instances of the Runnable class
Runnable runnable1 = new NumberPrinter(1, 5); Runnable runnable2 = new NumberPrinter(6, 10);
// Create threads and associate them with runnable
Thread thread1 = new Thread(runnable1); Thread thread2 = new Thread(runnable2);

thread1.start();
     thread2.start();
        
    }}