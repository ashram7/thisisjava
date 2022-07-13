package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();     
		a.field1 = 1;     //(O)
		//a.field2 = 1;   //(X) default 필드 접근 불가 (컴파일 에러) 
		//a.field3 = 1;   //(X) private 필드 접근 불가 (컴파일 에러)
		
		a.method1();      //(O)
		//a.method2();    //(X) default 메소드 접근 불가 (컴파일 에러)
		//a.method3();    //(X) private 메소드 접근 불가 (컴파일 에러)
	}
}
