package learnjava;

public class Fruits {
	public void apple() {
		String f1 = "apples are red";
		System.out.println(f1);
	}

	public void mango() {
		String f2 = "mangoes are yellow";
		System.out.println(f2);
	}

	public void papaya() {
		String f3 = "papayas are orange";
		System.out.println(f3);
	}

	public static void main(String[] args) {
		Fruits object = new Fruits();
		object.apple();
		object.mango();
		object.papaya();
		

	}

}
