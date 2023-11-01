package com.npci.service;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.beans.Account;
import com.npci.beans.Profile;
import com.npci.beans.Wallet;
import com.npci.dao.ProfileDao;
import com.npci.exceptions.InvalidDetailsException;
import com.npci.exceptions.ProfileNotFoundException;
import com.npci.validations.Validations;

import jakarta.transaction.Transactional;

@Service
public class profileServiceImpl implements profileService {
	@Autowired
	private ProfileDao profiledao;
	

	@Override
	@Transactional
	public Profile CreateProfile(String email_id, String name, String password, LocalDate dob, long phno) throws InvalidDetailsException {
			
		// Validate the inputs
		if (Validations.isValidEmail(email_id)&&Validations.validateName(name)
				&& Validations.validatePassword(password) && Validations.isDateValid(dob)
				&& Validations.validatePhone(phno)) {
			Wallet wallet=new Wallet();
			wallet.setAmount(5000);
			Account account=new Account();
			account.setAmount(10000);
			Profile profile = new Profile(0, email_id,name,password,dob,phno);
			profile.setWallet_id_ref(wallet);
			profiledao.save(profile);
			return profile;
		}
		throw new InvalidDetailsException("Enter Details Correctly");
	 
	}


	@Override
	public Profile Login(String emailId, String password) throws ProfileNotFoundException {
		if (profile.getEmailId()==emailId && profile.getPassword()==password) {
			return profile;
		}
		throw new ProfileNotFoundException("Profile With this Deatils Not Exists");
	}
}