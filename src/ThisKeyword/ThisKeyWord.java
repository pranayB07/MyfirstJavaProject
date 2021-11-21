package ThisKeyword;

public class ThisKeyWord {
	
	public String str="pranay";
	public static int num=25;
	
	
	
	ThisKeyWord()
	{
		num=30;
		System.out.println("constructor");
	}
	ThisKeyWord(int i)
	{
		this();  //here we are using this to invoke the current class constructor
		System.out.println("constructor " + i);
	}
	
	public void method()
	{
		System.out.println("Non static method");
	}
	
	public static void method1()
	{
		System.out.println(" Static method1");
	}
	
	public static void main(String[] args) {
		
		ThisKeyWord t=new ThisKeyWord(2);
		
	}

}
