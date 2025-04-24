import java.util.*;

public class ScannerExampleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("입력 문자열: ");
            String input = scanner.nextLine();  // 한 줄 전체 입력받음

            if (input.equals("q")) {
                break;  // q 입력 시 반복 종료
            }

            System.out.println("출력 문자열: " + input);
            System.out.println();  // 보기 좋게 빈 줄
        }

        System.out.println("종료");
        scanner.close();  // Scanner 닫기
    }
}
