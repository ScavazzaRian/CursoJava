package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		
		// Statment -> montar uma consulta no formato SQL
		// ResultSet -> devolve um resultSet pra gente
		
		
		
		DB.closeConnection();
	}

}
