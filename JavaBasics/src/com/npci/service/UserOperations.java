package com.npci.service;

import com.npci.User;
import com.npci.exceptions.UserNotFoundException;

public interface UserOperations {

	int store(User user);

	User[] findAll();

	User findUserByName(String name) throws UserNotFoundException;

}