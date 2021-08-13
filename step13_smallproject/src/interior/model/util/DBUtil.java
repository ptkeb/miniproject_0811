/* ???
 * 1. JDBC URL - oracle.jdbc.driver.OracleDriver
 */

// 고려사항
/*
 * 1.dbinfo 변수는 DBUtil에서만 사용
 * 2. sql변수는 DAO 즉 외부 클래스에서 사용
 * 
 * 1+2 특징 - 효과적인 코드는 단 한번 실행 보장 :  static{}로 구현
 * 2번에 해당하는 sql 정보를 보유한 객체를 DAO에게 제공할떄는 주소값 공유;
 * 
 */

package interior.model.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil { 
	//db의 설정 정보를 보유한 객체
	private static Properties dbinfo = new Properties();
	
	//모든 DAO클래스가 사용할 sql문장 정보
	private static Properties sql = new Properties();

	static{ 
		try {
			dbinfo.load( new FileInputStream("db.properties") );
			sql.load(new FileInputStream("interiorsql.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Properties getSql() {
		return sql;
	}

	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbinfo.getProperty("jdbc.url") , dbinfo.getProperty("jdbc.id"), dbinfo.getProperty("jdbc.pw"));
	}

	// DML용
	public static void close(Connection con, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	// SELECT용
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
}
