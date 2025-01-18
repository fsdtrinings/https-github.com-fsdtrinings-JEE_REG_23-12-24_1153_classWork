package p2;

@FunctionalInterface
interface ABC
{
	public void doStuff(int x,String name,boolean b);
	public default boolean someTask(boolean b) {
		return !b;
	}
	public static void abcWork()
	{
		// some code
	}
	
}

public class Demo3 {

}
