package DemoThread;

public class ThreadDemo extends Thread {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Thread t=new Thread(t1);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("The value from main is"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
