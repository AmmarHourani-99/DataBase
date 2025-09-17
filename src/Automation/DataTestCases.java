package Automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataTestCases {

	
	
	Connection con ; 
	
	
	
	
	
	Statement stmt ;
	
	
	
	
	ResultSet rs ;
	
	
	
	
	@BeforeTest
		public void MySetUp() throws SQLException {
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Ammar1999");
		
		
	}
	
	@Test
	public void CreateData() {
		
	}
		
	@Test
	public void ReadData() {
		
	}
	
	
	@Test
	public void UpdateData() {
		
	}
	
	
	@Test
	public void DeleteData() {
		
	}
	
	
	
	
	
	
}
