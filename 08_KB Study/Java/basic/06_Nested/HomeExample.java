public class HomeExample {
	public static void main(String[] args) {
		//Home 객체 생성
		Home home = new Home();
		

		
		//익명 구현 객체가 대입된 매개변수 사용
		home.use1(new RemoteControl() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
		});
	}
}
