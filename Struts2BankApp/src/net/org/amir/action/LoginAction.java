package net.org.amir.action;



import net.org.amir.dao.ConnectionDao;
import net.org.amir.dto.Usercredential;
public class LoginAction extends Usercredential   {
	
	private static final long serialVersionUID = 1L;
	ConnectionDao conndao= new ConnectionDao();

	
	public ConnectionDao getConndao() {
		return conndao;
	}
	public void setConndao(ConnectionDao conndao) {
		this.conndao = conndao;
	}
public String completeRegister(){
	ConnectionDao.completeRegistration(this);
	return "success";
		
	
	}
public String login(){
	//System.out.println("inside login method");
	
	if(ConnectionDao.validUser(this))
	{
		sessionMap.put("userName", getUserName());
		return "success";
	}
	else{
		return "error";
	}


	
}

public String changePassword()
{
	//sessionMap.put("userName", getUserName());
	ConnectionDao.change_userpassword(this);
	return"success";
}
public String user_transactionHome(){
	//sessionMap.put("userName", getUserName());
	ConnectionDao.show_usertransactionHome(this);
	return"success";
}
/*public void validate() {

if (getUserName().length() == 0) {

addFieldError("userName", "User Name is required");

} 

if (getPassword().length() == 0) {

addFieldError("password", "password field can not be empty");

}*/

public String logout() {
    //   remove userName from the session
	
	        // remove userName from the session
	        if (sessionMap.containsKey("userName")) {
	            sessionMap.remove("userName");
	          //  sessionMap.clear();
	            return "success";
	        }
	        else
	        {
	    
   return "error";
 }
}
 

}
