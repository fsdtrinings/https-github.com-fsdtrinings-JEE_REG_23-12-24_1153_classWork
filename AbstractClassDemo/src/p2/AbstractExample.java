package p2;

abstract class A{
	
	public void aWork(int a)
	{
		
	}
	
	public abstract void aMethod2();
}

abstract class B extends A
{

	@Override
	public void aWork(int a) {
		
	}
	
	public void bLocalmethod()
	{
		
	}
}


class C extends B
{
	@Override
	public void aWork(int a) {
		
	}
	
	@Override
	public void aMethod2() {
		// TODO Auto-generated method stub
		
	}
	

}

public class AbstractExample {

	public static void main(String[] args) {
		B obj = new C();
	}
}



















