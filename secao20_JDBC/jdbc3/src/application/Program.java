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
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse("05/11/2002", dt);
		Connection conn = null;
		PreparedStatement pt = null;

		try {
			conn = DB.getConnection();

			pt = conn.prepareStatement(
					"INSERT INTO SELLER (NAME, EMAIL, BIRTHDATE, BASESALARY, DEPARTMENTID) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			pt.setString(1, "Carl Purple");
			pt.setString(2, "carl@gmail.com");
			pt.setObject(3, java.sql.Date.valueOf(ld));
			pt.setDouble(4, 2000.00);
			pt.setInt(5, 4);

			int rowsAffected = pt.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = pt.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: " + id);
				}
			} else {
				System.out.println("No rows affected!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatment(pt);
			DB.closeConnection();
		}
	}
}
