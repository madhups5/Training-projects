package com.npci.service;

import java.time.LocalDate;
import java.util.List;

import com.npci.beans.Profile;
import com.npci.exceptions.InvalidDetailsException;
import com.npci.exceptions.ProfileNotFoundException;

public interface profileService {
		

	Profile Login(String emailId, String password) throws ProfileNotFoundException;

	Profile CreateProfile(String email_id, String name, String password, LocalDate dob, long phno)
			throws InvalidDetailsException;

}
