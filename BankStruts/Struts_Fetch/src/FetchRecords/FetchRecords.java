package FetchRecords;
import java.sql.*;
import java.util.ArrayList;

public class FetchRecords {
	ArrayList<User> list=new ArrayList<User>();

	public ArrayList<User> getList() {
		return list;
	}
	public void setList(ArrayList<User> list) {
		this.list = list;
	}

	public String execute(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Hibernate","postgres","1234");
			PreparedStatement ps=con.prepareStatement("select * from abc");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				User user=new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				list.add(user);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return "success";
   }
}
