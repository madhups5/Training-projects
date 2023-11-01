package com.npci.service;

import com.npci.beans.Account;
import com.npci.beans.Contact;
import com.npci.beans.Profile;
import com.npci.beans.Wallet;
import com.npci.exceptions.InsufficientBalanceException;

public interface WalletTransactions {
 
	double addFunds(double amount,Account account) throws InsufficientBalanceException;
	double showBalance();
	void transfer(double amount, Wallet wallet_id_ref, Wallet wallet_id_ref1); 
}
