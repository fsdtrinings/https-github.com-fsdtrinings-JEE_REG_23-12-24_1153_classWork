package p1;

public class Dog extends Animal{

	Dog(int weight,String animalName)
	{
		super(weight, animalName);
	}
	
	
	public boolean doPlayGames()
	{
		if(super.getWeight()>76)
		{
			int weight = super.getWeight();
			 weight-=10;
			 super.setWeight(weight);
			 System.out.println("After Playing game "+super.getWeight());
			 return true;
		}
		return false;
		 
	}


	@Override
	public void doEat() {
		 int weight = super.getWeight();
		 weight+=3;
		 super.setWeight(weight);
	}
	
	
	
	
}
