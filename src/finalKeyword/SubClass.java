package finalKeyword;

public class SubClass {
	
	//we cant inherit the mainclass because it has final keyword

	public void method1() {
		
		System.out.println("method1(sub) is excecuted");
	}

	public void method2() {
		
		System.out.println("method2(sub) is excecuted");
	}

	public static void main(String[] args) {
		/*
		 * MainClass m=new MainClass(); m.methodA(); m.methodB();
		 */
		//we cant inherit but we can instantiate the final class
		SubClass sub=new SubClass();
		sub.method1();
		sub.method2();
		/*
		 * sub.methodA(); sub.methodB();
		 */
	}

}
