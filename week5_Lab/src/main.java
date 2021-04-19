public class main {
	public static void main(String[] args)
	{
		Cat cat = new Cat("Nabi", (float) 3.3, "Sewon");
		Dog dog = new Dog("Mung", (float) 5.9, "Jongwoo");
		Crocodile croc = new Crocodile("Coco", (float)11.1);
		
		cat.bark();
		dog.bark();
		
		System.out.println(cat.getName());
		System.out.println(cat.getWeight());
		System.out.println(cat.getNameOfSlave());
		
		System.out.println(croc.getFood());
		
		
	}
}
