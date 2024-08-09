package day7;

public class Bank {
	
	private int accountNo;
	private String acctHolder;
	private double amount;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAcctHolder() {
		return acctHolder;
	}
	public void setAcctHolder(String acctHolder) {
		this.acctHolder = acctHolder;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", acctHolder=" + acctHolder + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
