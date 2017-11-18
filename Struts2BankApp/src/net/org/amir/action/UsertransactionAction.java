package net.org.amir.action;


import net.org.amir.dao.UsertransactionDao;
import net.org.amir.dto.Acountdetails;

public class UsertransactionAction extends Acountdetails{
	
	UsertransactionDao conndao= new UsertransactionDao();

	public UsertransactionDao getConndao() {
		return conndao;
	}

	public void setConndao(UsertransactionDao conndao) {
		this.conndao = conndao;
	}

	public String accountTransaction()
	{
		System.out.println("Transaction" + getTansactionType());
		System.out.println("set account No:"+getAccountNo());
		if(getTansactionType().equals("02"))
		{
			conndao.account_Deposit(this);
			return "success";
		}
		else if(getTansactionType().equals("03")){
			{
				conndao.account_withdraw(this);
				return "success";
			}
		}
		return "error";
		
		 
		
	}
}
