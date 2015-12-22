package DemoPractice;

public class Test implements Runnable {
	 String str="lock";
	 String str1="release";
public static void main(String[] args) {
		Test t=new Test();
		Thread thread=new Thread(t,"sun");
		Thread thread1=new Thread(t,"moon");
		thread.start();
		thread1.start();
}

@Override
public void run() {
		if(Thread.currentThread().getName().equals("sun"))
		{
		synchronized(str){
		System.out.println("lock acquired by sun");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		

		synchronized(str1){
			System.out.println("release by sun");
		}
	}
	
}
		else if(Thread.currentThread().getName().equals("moon"))
		{
			synchronized(str1){
				System.out.println("lock acquired by moon");
				/*try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
				synchronized(str){
					System.out.println("release by moon");
				}
			}	
		}
}
}
