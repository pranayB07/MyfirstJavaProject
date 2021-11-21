package finalKeyword;

public class Final_method {
	
	//with final keyword method, we cant override the method
	//we can overload the method
	
	public final void method1(int a, int b)
	{
		int z=a+b;
		System.out.println("Final method is excecuted.." + z);
	}
	
	public void method1(int a, int b,int c)
	{
		//we can overload the final method
		int z=a+b+c;
		System.out.println(z);
		
	}

	public static void main(String[] args) 
	{
		
		

	}

}
