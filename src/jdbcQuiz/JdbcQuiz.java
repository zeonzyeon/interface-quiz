package jdbcQuiz;

import java.sql.*;

public class JdbcQuiz {
    // MySQL 연결 정보
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/test_db";
    private final static String username = "root";
    private final static String password = "0000";

    public static void main(String[] args) {
        // SQL 쿼리: students 테이블에서 name, age, address 컬럼을 선택
        String query = "SELECT name, age, address FROM students WHERE age BETWEEN 30 AND 39";

        // MySQL 연결
        try (Connection conn = DriverManager.getConnection(DB_URL, username, password);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            // SQL 실행 및 처리
            System.out.println("< students 테이블의 30대 학생 목록 >");
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");

                System.out.println("name: " + name + ", age: " + age + ", address: " + address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
