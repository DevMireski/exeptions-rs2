package entities;

import exception.BusinessException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawlimt;

	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance, Double withdrawlimt) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimt = withdrawlimt;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit () {
		return  withdrawlimt;
	}
	public  void  setWithdrawLimit (Double withdrawlimt) {
		this.withdrawlimt = withdrawlimt;
	}
	public void Deposit(Double amount) {
		balance = balance + amount;
	}
	public void Withdraw(Double amount) {
		ValidWithdraw(amount);
		balance = balance - amount;
	}
	public void ValidWithdraw(Double amount) {
		if(amount > getWithdrawLimit()) {  
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new BusinessException("Withdraw error: Not enough balance");
		}
	}
	@Override
	public String toString() {
		return "number: " + number + " - holder: " + holder + " - balance: " + balance + " - withdrawlimt: " + withdrawlimt ;
	}
	
}

