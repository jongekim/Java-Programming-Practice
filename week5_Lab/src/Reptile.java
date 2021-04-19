abstract class Reptile extends Animal {

	Reptile(String in_name, float in_weight)
	{
		super(in_name, in_weight);
	}
	
	 abstract String getFood();
}