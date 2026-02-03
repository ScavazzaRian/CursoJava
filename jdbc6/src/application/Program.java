package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();

			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE SELLER SET BASESALARY = 2090 WHERE DEPARTMENTID = 1");			
			int rows2 = st.executeUpdate("UPDATE SELLER SET BASESALARY = 3090 WHERE DEPARTMENTID = 2");
			
			conn.commit();
			
			System.out.println("Rows1: " + rows1);
			System.out.println("Rows2: " + rows2);
		} catch (SQLException e) {
			try {
				// ERRO DA TRANSACAO
				conn.rollback();
				throw new DbException("Transcation rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				// ERRO AO DAR ROLLBACK
				throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
			}
		} finally {
			DB.closeConnection();
			DB.closeStatment(st);
		}
	}
}
