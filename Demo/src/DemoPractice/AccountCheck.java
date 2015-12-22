package DemoPractice;

public class AccountCheck implements Runnable {
 int balance=5000;

	public static void main(String[] args) {
		AccountCheck ac=new AccountCheck();
		Thread thread =new Thread(ac);
		Thread thread1=new Thread(ac);
		thread.setName("Pankaj");
		thread1.setName("priyanka");
		thread.start();
		thread1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
			makeWithdraw(2000);
			if(getBalance()<0)
			{
				System.out.println("Insuffcient amount");
			}
		
	}
	
	public synchronized void  makeWithdraw(int amt)
	{
		if(getBalance()>amt)
		{
			System.out.println("you can withdraw the amount"+ Thread.currentThread().getName());
		}
		try {
			withdraw(amt);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getBalance()
	{
		return balance;
	}
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}
}
