package oops;

class Cat {
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is WALKING");
	}
	
	public void eat() {
		System.out.println("Cat is EATING");
	}
	
	public void sleep() {
		System.out.println("Cat is SLEEPING");
	}
	
	public void description() {
		System.out.println("MY CAT HAS " + legs + " LEGS " + eyes + " EYES ");
	}
}

class Dog{
	
	String breed, name;
	
	public void jump() {
		System.out.println("my dog" + name + " JUMPED");
	}
	
	public void description() {
		System.out.println("my dog's " + name + " and breed is " + breed);
	}
	
}
public class MainClass {

	public static void main(String[] args) {
	
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.walk();
//		cat2.sleep();
//		
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		
//		cat2.legs = 3;
//		cat2.eyes = 1;
//		
//		cat1.description();
//		cat2.description();
		
		Dog miku = new Dog();
		Dog bozzo = new Dog();
		
		miku.breed = " Miku";
		miku.name = " Browny";
		
		bozzo.breed = "Bozzo";
//		bozzo.name = " Mungerlal";
		
		miku.jump();
		miku.description();
		
		bozzo.jump();
		bozzo.description();
	}

}

