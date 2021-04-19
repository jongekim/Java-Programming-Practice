abstract class Mammal extends Animal {

	Mammal(String in_name, float in_weight)
	{
		super(in_name, in_weight);
	}


	 abstract void bark();

	 abstract String getFood();
}