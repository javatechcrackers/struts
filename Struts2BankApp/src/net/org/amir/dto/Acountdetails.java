package net.org.amir.dto;

import java.sql.Date;



public class Acountdetails {
	private float amount;
	private int accountNo;
	private String tansactionType;
	private float netAmount;
	java.util.Date today = new java.util.Date();
	private Date date =new Date(today.getTime());
	private int toaccountNo;

	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
		
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getTansactionType() {
		return tansactionType;
	}
	public void setTansactionType(String tansactionType) {
		this.tansactionType = tansactionType;
	}
	/*public void deposit(){
		netAmount+=amount;
	}*/
	public float getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(float netAmount) {
		this.netAmount = netAmount;
	}
	public int getToaccountNo() {
		return toaccountNo;
	}
	public void setToaccountNo(int toaccountNo) {
		this.toaccountNo = toaccountNo;
	}
	

}
