package DemoPractice;


class Extender extends Thread
{
	public Extender()
	{
		
	}
	public Extender(Runnable runnable)
	{
		super(runnable);
	}
	public void run()
	{
		System.out.println("Extender");
	}
}
	 class implementer implements Runnable{
	public void run()
	{
		System.out.println("implementer");
	}
}
public class DemoThread {
		public static void main(String[] args) {
			new Extender(new implementer()).start();
			new Extender().start();
			new Thread(new implementer()).start();
		}
}
