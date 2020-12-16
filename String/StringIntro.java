package String;

public class StringIntro {

	public static void main(String[] args) {
		
		String name = "Subham Paul";
		String name2 = "Subham";
		String anotherName = new String("Subham");
		String cars = "Audi, Maruti, BMW, OLA";
		String nameTrim = "     Subham     Paul";
		
		//System.out.println(" "+ name);
		
		//System.out.println(name == anotherName); //because name create in POOL & anotherName create in HEAP area
		
		//System.out.println(name == name2); //because name & name both create in POOL area
		
//FUNCTIONS IN STRING
//		System.out.println(name.charAt(1));
//		System.out.println(name.length());
//		System.out.println(name.substring(2));
//		System.out.println(name.substring(1, 8));
//		System.out.println(name.contains("subha"));
//		System.out.println(name.contentEquals(name2));
//		System.out.println(name.isEmpty());
//		System.out.println(name.concat(" Alex"));
//		System.out.println(name.replace('a', 'k'));
//		String allCars[] = cars.split(",");
//		for(String car : allCars) {
//			System.out.print(car);
//		}
//		System.out.println(cars.indexOf('M'));
//		System.out.println(name.toLowerCase());
//		System.out.println(name.toUpperCase());
//		System.out.println(nameTrim.trim());   
//        System.out.println(nameTrim.replaceAll("\\s", ""));
	}

}
