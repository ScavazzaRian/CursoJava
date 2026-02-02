package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			st = conn.prepareStatement("DELETE FROM DEPARTMENT WHERE ID = ?");

			st.setDouble(1, 4);
			int rowsAffected = st.executeUpdate();
			System.out.println(rowsAffected);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
}
