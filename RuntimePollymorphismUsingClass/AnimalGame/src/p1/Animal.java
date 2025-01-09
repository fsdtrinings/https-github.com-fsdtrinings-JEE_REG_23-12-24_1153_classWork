package p1;


public class Animal {
	
	private int weight;
	private String animalName;
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int weight, String animalName) {
		super();
		this.weight = weight;
		this.animalName = animalName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	public void doEat()
	{
		this.weight++;
	}
	
	

}











