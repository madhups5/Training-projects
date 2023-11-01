package com.npci.utility;

import com.npci.service.UserOperations;
import com.npci.service.UserService;

public class UserOperationsFactory {

	public static UserOperations getInstance() {
		return new UserService();
	}
}
