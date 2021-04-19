public class Animal{
	private String name;
	private float weight;

	Animal(String in_name, float in_weight)
	{
		name = in_name;
		weight = in_weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setWeight(float weight)
	{
		this.weight = weight;
	}

	public String getName()
	{
		return name;
	}

	public float getWeight()
	{
		return weight;
	}
}