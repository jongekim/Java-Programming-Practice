final class Cat extends Mammal{
	
	private String nameOfSlave;
	
	Cat(String in_name, float in_weight, String in_nameOfSlave)
	{
		super(in_name, in_weight);
		nameOfSlave = in_nameOfSlave;
	}
	
	void bark() 
	{
		System.out.println("Meow");
	}
	
	String getFood()
	{
		return "Fish";
	}
	
	public void setNameOfSlave(String nameOfSlave)
	{
		this.nameOfSlave = nameOfSlave;
	}
	
	public String getNameOfSlave()
	{
		return nameOfSlave;
	}
}