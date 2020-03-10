package com.aklc.ed.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {


	public static Connection connect() throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite://C:\\practice\\database\\sqlite-tools-win32-x86-3300100/ed.db");
		return con;
	}

	
}
