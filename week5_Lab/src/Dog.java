final class Dog extends Mammal{
	
	private String nameOfMaster;
	
	Dog(String in_name, float in_weight, String in_nameOfMaster)
	{
		super(in_name, in_weight);
		nameOfMaster = in_nameOfMaster;
	}
	
	void bark() 
	{
		System.out.println("Bowbow");
	}
	
	String getFood()
	{
		return "Apple";
	}
	
	public void setNameOfMaster(String nameOfMaster)
	{
		this.nameOfMaster = nameOfMaster;
	}
	
	public String getNameOfMaster()
	{
		return nameOfMaster;
	}
}