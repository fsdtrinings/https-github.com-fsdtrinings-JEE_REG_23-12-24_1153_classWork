package p1;

public class Cat extends Animal {

	public Cat(int weight, String animalName) {
		super(weight, animalName);
		// TODO Auto-generated constructor stub
	}
	
	public boolean doWalk()
	{
		if(super.getWeight()>26)
		{
			int weight = super.getWeight();
			 weight-=10;
			 super.setWeight(weight);
			 System.out.println("After Walking  "+super.getWeight());
			 return true;
		}
		return false;
	}

	@Override
	public void doEat() {
		 int weight = super.getWeight();
		 weight+=2;
		 super.setWeight(weight);		
	}

	
}
