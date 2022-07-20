package test09;

public class Child extends Parent{
	private String name;
	
	public Child() {  // (1) super(); 생성되어야 함. 그러나 this() 때문에 실행되지 않음
		this("홍길동"); // (2) 인자가 하나인  아래 메소드 child(String name)가 실행됨
		System.out.println("Child() call");
	}
	
	public Child(String name) { // (3)이 생성자(파라메터가 하나인...) super()를 호출
		super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
