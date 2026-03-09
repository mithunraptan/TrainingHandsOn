package com.training.service;

import com.training.exception.InsufficientBalanceException;

public class WithdrawService {

    private double balance = 5000;

    public double withdraw(double amount) throws InsufficientBalanceException {

        if(amount <= 0){
            throw new InsufficientBalanceException("Amount must be greater than 0");
        }

        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;
        return balance;
    }
}