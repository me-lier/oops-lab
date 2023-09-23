class NumberPrinter extends Thread
{
public int end;
public int start;
public NumberPrinter(int start, int end)
{
this.start = start;
this.end = end; }
@Override
public void run()
{
for (int i = start; i <= end; i++)
{
System.out.println(Thread.currentThread().getName() + ":- " + i);
} }
}
public class MultiThreadExample{
    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter(1, 5);
NumberPrinter thread2 = new NumberPrinter(6, 10);
// Start both threads
thread1.start();
thread2.start();
    }
}