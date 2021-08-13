/* ???
 * 1. JDBC URL - oracle.jdbc.driver.OracleDriver
 */

// �������
/*
 * 1.dbinfo ������ DBUtil������ ���
 * 2. sql������ DAO �� �ܺ� Ŭ�������� ���
 * 
 * 1+2 Ư¡ - ȿ������ �ڵ�� �� �ѹ� ���� ���� :  static{}�� ����
 * 2���� �ش��ϴ� sql ������ ������ ��ü�� DAO���� �����ҋ��� �ּҰ� ����;
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
	//db�� ���� ������ ������ ��ü
	private static Properties dbinfo = new Properties();
	
	//��� DAOŬ������ ����� sql���� ����
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

	// DML��
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

	// SELECT��
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
