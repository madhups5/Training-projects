package com.npci.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.npci.beans.Account;
import com.npci.beans.Wallet;
import com.npci.dao.AccountDao;
import com.npci.dao.ProfileDao;
import com.npci.dao.WalletDao;
import com.npci.exceptions.InsufficientBalanceException;

public class WalletTransactionImpl implements WalletTransactions {
	Account account=new Account();
	Wallet wallet=new Wallet();
	
	@Autowired
	private WalletDao walletdao;
	@Autowired
	private AccountDao accountdao;
	@Autowired
	private ProfileDao profiledao;
	@Override
	public double addFunds(double amount,Account accountref) throws InsufficientBalanceException {
		
		if(account.getAmount()==0)
		{
		account.setAmount(3000);
		}
		if(amount<=account.getAmount())
		{
			wallet.setAmount(amount);
			double walletBal=amount+wallet.getAmount();
			walletdao.save(wallet);
			account.setAmount(account.getAmount()-walletBal);
			accountdao.save(account);
			return walletBal;
		}
		throw new InsufficientBalanceException("Not Enough Funds");
		
	}

	@Override
	public double showBalance() {
		return wallet.getAmount();	
	}

	@Override
	public void transfer(double amount,Wallet wallet_id_ref,Wallet wallet_id_ref1 ) {
		
		if(amount<=wallet.getAmount())
		{
			if(walletdao.findById(wallet_id_ref))
			{
				double recieverWallet=wallet_id_ref.getAmount()+amount;
				wallet_id_ref.setAmount(recieverWallet);
				walletdao.save(wallet_id_ref);
				
				double senderWallet=profiledao.findById(wallet_id_ref1);
				wallet_id_ref1.setAmount(senderWallet);
				walletdao.save(wallet_id_ref1);
				
				
			    
			}
		}
	}

}
