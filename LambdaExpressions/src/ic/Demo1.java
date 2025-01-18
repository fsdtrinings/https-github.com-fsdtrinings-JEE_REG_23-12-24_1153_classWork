package ic;

class AnotherClass
{
   int value = 10;
   
   public int getValue()
   {
	   return value;
   }
}

class MyClass
{
	
  public void doSomeWork(int x,String y,AnotherClass obj)
  {
	  y = x+obj.getValue()+"";
	  // some business logic 
  }
}


public class Demo1 {

	public static void main(String[] args) {
		
	}
}
