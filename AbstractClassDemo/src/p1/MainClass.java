package p1;


// Code act as a front end 
public class MainClass {

	public static void main(String[] args) {
		MainClass game = new MainClass();
		
		Dog d = new Dog(70,"Dog");
		game.doFeedAnimal(d);
		System.out.println("Dog Weight "+d.getWeight());
		
		// ---------------------------
		
		Cat cat = new Cat(20, "Cat");
		game.doFeedAnimal(cat);
		System.out.println("Cat Weight "+cat.getWeight());
	}
	
	public void doFeedAnimal(Animal a)
	{
		a.doEat();
		
	    if(a instanceof Dog)   //	if(a.getAnimalName().equals("Dog"))
		{
			System.out.println("Dog Weight After Feeding : "+a.getWeight());
			boolean isPlayed = playWithAnimal(a);
			if(isPlayed == false)
			{
				doFeedAnimal(a);
				
			}
			
		}
		if(a instanceof Cat)
		{
			boolean isWalking = goForWalk(a);
		}
		
	
		
	}
	
	public boolean goForWalk(Animal a)
	{
		Cat cat = (Cat)a; // class cast exception
		return cat.doWalk();
	}
	
	public boolean playWithAnimal(Animal a)
	{
		boolean playStatus = false;
		
		// some code to change the playStatus;
		Dog d = (Dog)a; //byte b = (byte)10;
		playStatus = d.doPlayGames();
		
		return playStatus;
	}
}
