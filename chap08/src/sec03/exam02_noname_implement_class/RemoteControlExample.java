package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /*실행문*/ }	
			public void turnOff() { /*실행문*/ }
			public void setVolume(int volume) { /*실행문*/ }			
		};
	}

}
