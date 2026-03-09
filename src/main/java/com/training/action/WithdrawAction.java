package com.training.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.service.WithdrawService;

public class WithdrawAction extends ActionSupport {

    private double amount;
    private double availableBalance;

    public String execute() throws Exception {

        WithdrawService service = new WithdrawService();

        availableBalance = service.withdraw(amount);

        return SUCCESS;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
    
    
}
