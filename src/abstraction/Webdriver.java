package abstraction;

public abstract class Webdriver {
	
	public Webdriver()
	{
		System.out.println("Abstract class constructor");
	}

	public abstract void click();

	public abstract void sendkeys();

	public abstract void signin();

    void nonAbstractMethod() {
		System.out.println("non Abstract method is excecuted..");
	}

}