package StaticKey;

 class employee
{
	int empid;
	String name;
	static String company="sysark";
	
	
	employee(int id, String name)
	{
		empid=id;
		this.name=name;
		
	}
	
	public void show()
	
	{
		System.out.println(empid + " ; " + name + ": "+company);
		
		
	}
}

public class StaticKeyworddemo {
	
	public static void main(String[] args) {
		
		employee obj=new employee(308,"pranaybhaskar");
		employee obj2=new employee(309,"bhaskar");
		obj.show();
		obj2.show();
		
		
		
	}

}
