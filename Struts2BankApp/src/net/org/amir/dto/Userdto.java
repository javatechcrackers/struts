package net.org.amir.dto;
//import com.itinpractice.struts2.model.Person;
import com.opensymphony.xwork2.ActionSupport;
public class Userdto extends ActionSupport {

	private static final long serialVersionUID = 1L;
private static String firstName;
private String lastName;
private String occupation;
private long mobileNo;
private String address;
private String officeAddress;
private String gender;
public static String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getOfficeAddress() {
	return officeAddress;
}
public void setOfficeAddress(String officeAddress) {
	this.officeAddress = officeAddress;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
/*public static String getFirstName() {
	return firstName;
}
public static void setFirstName(String firstName) {
	Userdto.firstName = firstName;
}
*/

}
