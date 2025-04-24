public class Database {
        private static final Database instance = new Database(); // 딱 하나만 생성됨
        private final String connection = "MySQL";

        private Database() {
            // 외부에서 생성자 호출 불가
        }

        public static Database getInstance() {
            return instance;
        }

        public String connect() {
            System.out.println(connection + "에 연결합니다.");
            return connection;
        }

        public void close() {
            System.out.println(connection + "을 닫습니다.");
        }
    }
