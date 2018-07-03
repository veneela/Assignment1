package com.postgresql.project.postgresql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class StoredCall {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","v33n@v3nny");
        CallableStatement cs = conn.prepareCall("{?=call increment(?,?)}");
	    cs.setInt(2,10);
	    cs.setInt(3,5);
	    cs.registerOutParameter(1,Types.INTEGER);  
	    cs.execute();
	    System.out.println(cs.getInt(1)); 
	}
}
