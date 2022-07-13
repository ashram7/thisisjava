package sec10.exam02_static_block;

public class Television {
	int field1;
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	//static String info =company + "-" + model;
	
	static {
		//field1 = 10; (x)
		//method1(); (x)
		info = company + "-" + model;
	}
	
	/*Statck void Method1() {
		obj1.company =Television ("LG ÀüÀÚ");
	}*/

	void method1() {
		
	}
	static void method2() {
		//this.field1 = 10; (x)
		//this.method1(); (x)
	}
	static void method3() {
		Television obj = new Television();
	    obj.field1 = 10;
	    obj.method1();
	}	
}


















