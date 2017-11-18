package net.org.amir.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.org.amir.action.LoginAction;
import net.org.amir.action.User_resisterAction;
import net.org.amir.dto.Userdto;

public class ConnectionDao extends ActionSupport
{
	
	private static final long serialVersionUID = 1L;
	  static Map<String, Object> session; 
	  static String user;
	static String username;
	static String temp;
	static String temp1;
	public static int accountResister(User_resisterAction userdto){
		int status=0;
		Connection connection=null;
	
	
try {
	Class.forName("org.postgresql.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try
{
connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");
PreparedStatement ps=connection.prepareStatement("insert into user_account(firstName,lastName,mobileNo,occupation,gender,address,officeAddress) values(?,?,?,?,?,?,?)");

ps.setString(1, userdto.getFirstName());
ps.setString(2,userdto.getLastName() );
ps.setLong(3,userdto.getMobileNo());
ps.setString(4,userdto.getOccupation());
ps.setString(5,userdto.getGender());
ps.setString(6,userdto.getAddress());
ps.setString(7,userdto.getOfficeAddress());
ps.executeUpdate();

					
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	if (connection!= null)
	{
		System.out.println("connection made successfully");
	}
	else{
		System.out.println("connection failed");
	}
	return status;

}
	public static int completeRegistration(LoginAction la)
	{
		User_resisterAction userdto=new User_resisterAction();
		int status=0;
		Connection connection=null;
	
try {
	Class.forName("org.postgresql.Driver");
    }
catch (ClassNotFoundException e) {
	e.printStackTrace();
}
try
{
connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");	
PreparedStatement ps=connection.prepareStatement("select accountnamuber from user_account where firstName=?");
System.out.println("first name="+userdto.getFirstName());
ps.setString(1,userdto.getFirstName());
ResultSet rs=ps.executeQuery();
while(rs.next())
{
	la.setAccountNo(rs.getInt(1));
}
if(la.getPassword().equals(la.getConfirmPassword()))
{
	PreparedStatement ps1=connection.prepareStatement("insert into user_credential values(?,?,?,?)");
	ps1.setInt(1, la.getAccountNo());
	ps1.setString(2, la.getUserName());
	ps1.setString(3, la.getPassword());
	ps1.setString(4, la.getConfirmPassword());
	ps1.executeUpdate();
}

	}
catch(SQLException e)
{
	e.printStackTrace();
}
	return status;
	}
	
	public static boolean validUser(LoginAction la){
	Connection connection=null;
/*	session= ActionContext.getContext().getSession();
	session.put(user, la.getUserName());
	*/
	try {
		Class.forName("org.postgresql.Driver");
	    }
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try{
		connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");	
		PreparedStatement ps=connection.prepareStatement("select * from user_credential where userName=? and password=?");
		ps.setString(1,la.getUserName());
		ps.setString(2, la.getPassword());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			la.setAccountNo(rs.getInt(1));
			temp= rs.getString(2);
		}
	
		
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();	
	}
	if(la.getUserName().equals(temp)){
		return true;
	}else{
		
		return false;
	}
	
	
	}
	
	public static int change_userpassword(LoginAction la){
	Connection connection=null;
	int status=0;
	/*session= ActionContext.getContext().getSession();
    username =  (String) session.get(user);*/
	try {
		Class.forName("org.postgresql.Driver");
	    }
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try{
		connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");	
		PreparedStatement ps=connection.prepareStatement("select * from user_credential where userName=?");
		ps.setString(1,la.getUserName());
		System.out.println("session user name is"+la.getUserName());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			la.setAccountNo(rs.getInt(1));
			temp= rs.getString(2);
			temp1=rs.getString(3);
		}
		if(la.getOldPassword().equals(temp1)&& la.getPassword().equals(la.getConfirmPassword())&& !(la.getOldPassword().equals(la.getPassword()))){
			PreparedStatement ps1=connection.prepareStatement("update user_credential set password=?,confirmPassword=?  where userName=?");
			ps1.setString(1,la.getPassword());
			ps1.setString(2, la.getConfirmPassword());
			ps1.setString(3, la.getUserName());
		    ps1.executeUpdate();

		}
		
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();	
	}

	return status;
	
	}
	public static int show_usertransactionHome(LoginAction la)
	{
		User_resisterAction userdto=new User_resisterAction();
		int status=0;
		Connection connection=null;
	System.out.println("show_usertransactionHome user name  is"+la.getUserName());
try {
	Class.forName("org.postgresql.Driver");
    }
catch (ClassNotFoundException e) {
	e.printStackTrace();
}
try
{
connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");	
PreparedStatement ps=connection.prepareStatement("select accountnamuber from user_account where firstName=?");
System.out.println("first name="+userdto.getFirstName());
ps.setString(1,la.getUserName());
ResultSet rs=ps.executeQuery();
while(rs.next())
{
	la.setAccountNo(rs.getInt(1));
}
}
catch(SQLException e)
{
	e.printStackTrace();
}
	return status;
	}
}
