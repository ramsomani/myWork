package DemoThread;

public class Test1 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("The value from thread is"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
