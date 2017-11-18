package net.org.amir.action;

public class LoginAction {
private String userName;
private String password;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String execute()
{
	System.out.println("welcome chandan");
	
	if(this.userName.equals("abcd")&& this.password.equals("1234")){
		return "success";
	}
	else{
		return "failure";
	}
}
}
