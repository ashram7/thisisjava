package test09;

public class Parent {
	public String nation;
	
	public Parent() {  // (4) 인자가 하나인 아래 메소드를 호출하고 있음
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) { // (5) 실행되면서 println() 까지 실행됨
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
