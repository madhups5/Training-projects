package com.npci.utility;

import com.npci.profileservice.ProfileService;
import com.npci.profileservice.ProfileServiceImpl;

public class ProfileOperationsFactory {
	public static ProfileService getInstance() {
		return new ProfileServiceImpl();

	}

}
