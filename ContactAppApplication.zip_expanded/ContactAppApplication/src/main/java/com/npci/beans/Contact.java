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
public class Contact {
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contact_id;
	
	//foreignkey
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="profile_id_ref")
	private Profile profile_id_ref;
	
	//foreignKey
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="wallet_id_ref")
	private  Wallet wallet_id_ref;
	
	//generate 2 constuctors
	public Contact(int contact_id) { 
		super();
		this.contact_id = contact_id;	
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public void setWallet_id_ref(Wallet wallet_id_ref) {
		this.wallet_id_ref = wallet_id_ref;
	}
	public void setProfile_id_ref(Profile profile_id_ref) {
		this.profile_id_ref = profile_id_ref;
	}

	
		
}
