package StaticKey;

public class StaticBlockQuestion {

	// How can we create objects if we make constructor private.

	public int age = 30;
	public String name="pranay";

	private StaticBlockQuestion() {
		System.out.println("Constructor");
	}

	static  {
		StaticBlockQuestion obj = new StaticBlockQuestion();
		System.out.println(obj.age);

	}

	public static Object createObjet() {
		StaticBlockQuestion obj = new StaticBlockQuestion();
		obj.age = 40;
		return obj;

	}

}
