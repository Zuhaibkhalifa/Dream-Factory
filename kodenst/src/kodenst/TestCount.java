package kodenst;

class TestCount extends Thread
{
public static void main(String [] args)
{
	TestCount t = new TestCount();
t.start();
System.out.print("one. ");
t.start();
System.out.print("two.");
}
public void run()
{
System.out.print("Thread ");
}
}