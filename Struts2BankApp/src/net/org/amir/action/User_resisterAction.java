package net.org.amir.action;

import net.org.amir.dao.ConnectionDao;
import net.org.amir.dto.Userdto;

public class User_resisterAction extends Userdto{
	public static String temp=getFirstName();
	ConnectionDao conndao= new ConnectionDao();
	public ConnectionDao getConndao() {
		return conndao;
	}
	public void setConndao(ConnectionDao conndao) {
		this.conndao = conndao;
	}
	public String resister() {
		
		int i=ConnectionDao.accountResister(this);

			return "success";

	}
	public void validate() {

		if (getFirstName().length() == 0) {

		addFieldError("firstName", "User Name is required");

		} 

		if (getLastName().length() == 0) {

		addFieldError("lastName", "password field can not be empty");

		}

		}

}
