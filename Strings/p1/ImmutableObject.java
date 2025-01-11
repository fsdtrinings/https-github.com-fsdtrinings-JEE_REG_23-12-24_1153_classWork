package p1;


class Demo
{
	int x = 10;
	
	public void doSomeWork()
	{
		// 100 lines of code
		x+=4;
	}
	public int getX() {return x;}
}


public class ImmutableObject {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.doSomeWork(); // calling a method
		System.out.println(d.getX()); // 14 , calling the method doSomeWork change the state of  d
		                              // (by changing the value x)

	
	   // --------------------------------------
		
		String s = "Spring";
		s.concat(" framework"); // calling a method
		System.out.println(s); // String obj are immutable
		s = s.concat(" framework");
	
	
	
	
	
	
	
	
	}












}




























