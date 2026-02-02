package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE SELLER SET BASESALARY = BASESALARY + ? WHERE DEPARTMENTID = ?");
			
			st.setDouble(1, 100.00);
			st.setInt(2, 4);
			
			int rowsAffected = st.executeUpdate();
			System.out.println(rowsAffected);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
}
