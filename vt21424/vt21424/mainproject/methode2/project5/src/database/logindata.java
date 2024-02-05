package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import project5.Datadriven;

public class logindata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Datadriven obj=new Datadriven();
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("JDBC Driver loaded");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sravani", "root", "root");
		System.out.println("Connected to Mysql");
		Statement smt= con.createStatement();
		ResultSet rs= smt.executeQuery("Select * from logindatabase");
		boolean last = rs.last();
		int rowcount = rs.getRow();
		System.out.println(rowcount);
		rs.first();
		//rs.next();
		for(int i= 1; i< 5; i++)
		{
			String un1= rs.getString(1);
			String pwd1= rs.getString(2);
			System.out.println(un1+ " "+ pwd1);
			rs.next();
			try {
				obj.launchapp();
				obj.login(un1, pwd1);
				obj.logout();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
		}
	}

}
