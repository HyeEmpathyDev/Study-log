import java.util.*;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x 값 입력: 3 ");
		int x = scanner.nextInt();  // 사용자로부터 정수 입력받기

		System.out.print("y 값 입력: 5 ");
		int y = scanner.nextInt();

		int sum = x + y;
		System.out.println("x + y: " + sum);
	}
}
