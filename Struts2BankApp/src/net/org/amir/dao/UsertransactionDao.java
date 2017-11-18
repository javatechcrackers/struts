package net.org.amir.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;

//import com.sun.jmx.snmp.Timestamp;

import net.org.amir.action.LoginAction;
import net.org.amir.action.User_resisterAction;
import net.org.amir.dto.Acountdetails;
//import java.util.Date;

public class UsertransactionDao {

	static float temp;
	static float temp1;

	public static int account_Deposit(Acountdetails la)
	{
		

		//User_resisterAction userdto=new User_resisterAction();
		//Timestamp timestamp = new Timestamp(new Date().getTime());
		int status=0;
		Connection connection=null;
		//la.deposit();
	
try {
	Class.forName("org.postgresql.Driver");
    }
catch (ClassNotFoundException e) {
	e.printStackTrace();
}
try
{
	
connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");	
//System.out.println("outdide if  "+la.getNetAmount());

if(la.getNetAmount()==0.0)
{
	PreparedStatement pst2=connection.prepareStatement("select netamount from user_transaction where accountno=?");
	pst2.setInt(1, la.getAccountNo());
	ResultSet rs=pst2.executeQuery();
	while(rs.next())
	{
		 temp= rs.getFloat(1);
	}
	temp1=temp+la.getAmount();
	System.out.println("inside if  "+la.getNetAmount());
PreparedStatement ps=connection.prepareStatement("insert into user_transaction values(?,?,?,?)");
ps.setInt(1,la.getAccountNo());
ps.setFloat(2, la.getAmount());

ps.setFloat(3, temp1);
//System.out.println(la.getDate());
ps.setDate(4,la.getDate());

ps.executeUpdate();
}
else 
{
	PreparedStatement pst1=connection.prepareStatement("select netamount from user_transaction where accountno=?");
   pst1.setInt(1, la.getAccountNo());
   ResultSet rs=pst1.executeQuery();
   while(rs.next())
   {
	 temp= rs.getFloat(1);
   }
   temp1=temp+la.getAmount();
	System.out.println("inside else  "+la.getNetAmount());
	PreparedStatement pst=connection.prepareStatement("update user_transaction set amount=?,netamount=?,transaction_date=?,tansactionType=? where accountno=?");
	pst.setFloat(1, la.getAmount());
	
//		la.deposit();
	pst.setFloat(2, temp1);
	pst.setDate(3, la.getDate());
	pst.setInt(4, la.getAccountNo());
	pst.setString(6, la.getTansactionType());
	pst.executeUpdate();
}
/*while(rs.next())
{
	la.setAccountNo(rs.getInt(1));
}*/
}
catch(SQLException e)
{
	e.printStackTrace();
}
	return status;
	}

	//////////////////////////////////////////////////////////////////s
	
	
	public static int account_withdraw(Acountdetails la){
		int status=0;
		Connection connection=null;
		//la.deposit();
	
try {
	Class.forName("org.postgresql.Driver");
    }
catch (ClassNotFoundException e) {
	e.printStackTrace();
}
try
{
	
connection=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BANK","postgres","1234");	
//System.out.println("outdide if  "+la.getNetAmount());

if(la.getAmount()+500 <= la.getNetAmount())
{
	float fromaccount = la.getNetAmount() - la.getAmount();
	
	PreparedStatement pst2=connection.prepareStatement("select netamount from user_transaction where accountno=?");
	pst2.setInt(1, la.getAccountNo());
	ResultSet rs=pst2.executeQuery();
	while(rs.next())
	{
		 temp= rs.getFloat(1);
	}
	temp1=temp+la.getAmount();
	System.out.println("inside if  "+la.getNetAmount());
PreparedStatement ps=connection.prepareStatement("insert into user_transaction values(?,?,?,?,?,?)");
ps.setInt(1,la.getAccountNo());
ps.setFloat(2, la.getAmount());

ps.setFloat(3, temp1);
//System.out.println(la.getDate());
ps.setDate(4,la.getDate());
ps.setInt(5,la.getToaccountNo());
ps.setString(6, la.getTansactionType());

ps.executeUpdate();
}
else 
{
	PreparedStatement pst1=connection.prepareStatement("select netamount from user_transaction where accountno=?");
   pst1.setInt(1, la.getAccountNo());
   ResultSet rs=pst1.executeQuery();
   while(rs.next())
   {
	 temp= rs.getFloat(1);
   }
   temp1=temp+la.getAmount();
	System.out.println("inside else  "+la.getNetAmount());
	PreparedStatement pst=connection.prepareStatement("update user_transaction set amount=?,netamount=?,transaction_date=? toaccountNo=? tansactionType=? where accountno=?");
	pst.setFloat(1, la.getAmount());
	
//		la.deposit();
	pst.setFloat(2, temp1);
	pst.setDate(3, la.getDate());
	pst.setInt(4, la.getAccountNo());
	pst.setInt(5,la.getToaccountNo());
	pst.setString(6, la.getTansactionType());
	pst.executeUpdate();
}
/*while(rs.next())
{
	la.setAccountNo(rs.getInt(1));
}*/
}
catch(SQLException e)
{
	e.printStackTrace();
}
		return status;
		
	}
}

