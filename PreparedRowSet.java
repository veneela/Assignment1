package com.postgresql.project.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class PreparedRowSet {

	public static void main(String[] args) {

		try {
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			rowSet.setUrl("jdbc:postgresql://localhost:5432/postgres");
			rowSet.setUsername("postgres");
			rowSet.setPassword("v33n@v3nny");
			Connection conn = DriverManager.getConnection(rowSet.getUrl(),rowSet.getUsername(),rowSet.getPassword());
			PreparedStatement ps = conn.prepareStatement("insert into Employee values(?,?,?)");
			ps.setInt(1, 102);
			ps.setString(2, "teja");
			ps.setString(3, "india");
			int i = ps.executeUpdate();
			System.out.println(i + " row inserted");
			rowSet.setCommand("select * from Employee");
			rowSet.execute();
			while (rowSet.next()) {
				System.out.println("Id: " + rowSet.getInt(1));
				System.out.println("Name: " + rowSet.getString(2));
				System.out.println("address: " + rowSet.getString(3));
			}
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
