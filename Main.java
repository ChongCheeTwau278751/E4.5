package Exe4_5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple("Apple","Small", 10, 1, 0.12);
		System.out.println(a1);// Overriding toString of Fruit
		a1.printData();
		System.out.println();
	
		Orange o1 = new Orange("Orange","Small","Navel", 0.15, "Box",12 ,1);
		System.out.println(o1);// Overriding toString of Fruit
		o1.printData();
		System.out.println();
		
		Kiwi k1 = new Kiwi("Kiwi","Small","Zespri", 0.10, "Box", 17, 1);
		System.out.println(k1);// Overriding toString of Fruit
		k1.printData();
		System.out.println();
		
		RedApple r1 = new RedApple("Red Apple","Small", 11, 5, 0.15, 6, 14.06, 0.24, "Fuji");
		System.out.println(r1);// Overriding toString of Apple
		r1.printData();
		System.out.println();
		
		GreenApple g1 = new GreenApple("Green Apple","Small", 10, 5, 0.20, 58, 2.8, 0.15, "Pippin");
		System.out.println(g1);// Overriding toString of Apple
		g1.printData();
		System.out.println();
	}

}
