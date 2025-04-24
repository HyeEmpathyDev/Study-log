public class DatabaseExample {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();           // ① 싱글톤 객체 호출
        String connect = db1.connect();                  // ② 연결 + 리턴값 저장
        System.out.println("데이터베이스: " + connect);  // ③ 연결명 출력
        db1.close();                                     // ④ 연결 종료
    }
}
