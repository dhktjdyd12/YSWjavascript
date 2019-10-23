package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection getConect() {          // Connection 인터페이스 
		Connection conn = null;   // null 값으로 초기화
		
		// DB 접속정보
		String user = "hr";       // 접속할 곳 아이디
		String passwd ="hr";      // 접속할 곳 비밀번호
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  // 사용하려는 데이터베이스명을 포함한 URL 기술
		
		// 드라이버 로딩변수 driver 선언
		String driver = "oracle.jdbc.driver.OracleDriver";   
	
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			
			// 2. 연결
			conn = DriverManager.getConnection(url, user, passwd);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

