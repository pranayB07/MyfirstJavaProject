package interfaceDemo;

public class Child1 extends ParentClass1 implements Parent1, Parent2 {

	public void show() {
		System.out.println("show child method");
	}

	public static void main(String[] args) {
		Child1 c = new Child1(); // we can reference parent1 and parent2 also (polymorhic referance)
		c.show();
	}

}
