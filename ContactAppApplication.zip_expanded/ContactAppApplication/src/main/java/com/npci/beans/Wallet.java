package com.npci.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Wallet {
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int wallet_id;
	private double amount;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="account_number_ref")
	private Account account_number_ref;
	public Wallet(int wallet_id, double amount) {
		super();
		this.wallet_id = wallet_id;
		this.amount = amount;
	}
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setAccount_number_ref(Account account_number_ref) {
		this.account_number_ref = account_number_ref;
	}
	@Override
	public String toString() {
		return "Wallet [wallet_id=" + wallet_id + ", amount=" + amount + ", account_number_ref=" + account_number_ref
				+ "]";
	}
	
	

}
