public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "0106241230123";
		char man = ssn.charAt(6);
		switch (man) {
			case '1':
			case '3':
				System.out.println("남자 입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다.");
				break;
		}
	}
}
