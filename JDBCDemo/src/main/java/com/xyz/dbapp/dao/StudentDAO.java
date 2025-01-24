package com.xyz.dbapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xyz.dbapp.entity.Student;

// DAO stands for Data Access Object, this is class which communicate with DB
public class StudentDAO 
{
	
	// Code to connect with data 
	Connection con; // this obj is responsible for DB connection
	PreparedStatement ps; // this obj is responsible to execute SQL queries
	
	public StudentDAO()throws SQLException,ClassNotFoundException {
		String host = "localhost:3306"; // localhost :- IP of server
		String database = "bng"; // database
		String url = "jdbc:mysql://"+ host+"/"+database;
		   //      jdbc:mysql://192.136.5.4:3306/bng   
		String username = "root";
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		System.out.println("Con Establish : - "+con);
		
	}
	
	public String saveStudent(int id,String name,String coursename,int marks)throws Exception
	{
		String insertQuery = "insert into student values (?,?,?,?)";
		
		ps = con.prepareStatement(insertQuery); // hit db with query
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, marks);
		ps.setString(4, coursename);
		
		int  rowsEffected = ps.executeUpdate(); // executing the SQL here
		if(rowsEffected > 0) return "saved Student "+id+" - "+name;
		else return null;
		
	}
	
	public Student getStudentFromDBByID(int searchid)throws SQLException
	{
		String query = "select * from student where stuid = ?";
		
		ps = con.prepareStatement(query);
		ps.setInt(1, searchid);
		
		ResultSet rs = ps.executeQuery();
		Student s = null;
		
		while(rs.next())
		{
			s = new Student();
			s.setStuid(rs.getInt("stuid"));
			s.setStuname(rs.getString("stuname"));
			s.setCoursename(rs.getString("courseName"));
			s.setMarks(rs.getInt("marks"));
			
		}
		return s;
	}
	
	public List<Student> getStudentsbyCourseName(String filterCourseName)
	{
		return null;
	}

}
