package com.npci.profileservice;

import com.npci.exceptions.InvalidDetailsException;
import com.npci.profile.Profile;

public interface ProfileService {
	Profile saveProfile(Profile profile);
	String ShowAllProfiles();
	Profile Login(String email_id, String password) throws InvalidDetailsException;
	String deleteProfile(String email_id);
}
