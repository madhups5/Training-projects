package com.npci.service;

import com.npci.User;
import com.npci.exceptions.UserNotFoundException;

/// service layer class
public class UserService implements UserOperations {
	private static User[] users= new User[5];
	private static int index=0;
	@Override
	public int store(User user)
	{
		users[index]=user;
		if(index>=5)
		{
			return -1;
		}
		users[index++]=user;
		return 1;
	}
	@Override
	public User[] findAll()
	{
		User[] copy= new User[index];
		for(int i=0;i<index;i++)
		{
			
			copy[i]=users[i];
		}
		return copy;
	}
	@Override
	public User findUserByName(String name) throws UserNotFoundException
	{
		User[] array=findAll();
		for(User u:array)
		{
			if(u.getName().equals(name))
			{
				return u;
			}
		}
		throw new UserNotFoundException("Sorry"+name+"Not Found");
	}
}
