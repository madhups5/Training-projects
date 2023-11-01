package com.npci.service;

import java.util.List;
import com.npci.beans.Contact;
import com.npci.beans.Profile;
import com.npci.beans.Wallet;
import com.npci.exceptions.ContactNotFoundException;
import com.npci.exceptions.ProfileNotFoundException;

public interface Login {


	List<Contact> viewAllContacts();

	Profile deleteMyProfile(int id) throws ProfileNotFoundException;

	void addContacts(Profile profile_id_ref, Wallet wallet_id_ref);	
	
	void logout();

	void deleteContact(int contactId) throws ContactNotFoundException;



}
