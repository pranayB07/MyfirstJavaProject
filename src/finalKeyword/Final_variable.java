package finalKeyword;

public class Final_variable {

	// you cant change the value of variable if you make it final

	final int a = 10;
	int b = 20;

	public static void main(String[] args)

	{
		Final_variable fa = new Final_variable();
		System.out.println(fa.a);
		System.out.println(fa.b);
		fa.b = 30;
		System.out.println(fa.b); // here the value is changed because it is not final
		// fa.a=30; ---->showing error because you cant change the value

	}

}
