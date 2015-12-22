

class A{
	public Integer show(){
		System.out.println("from A");
		return 23;
	}
}

class B extends A{
	public Integer show(){
		System.out.println("from B");
		return 56;
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		
		B b=new B();
		b.show();
	}
}
