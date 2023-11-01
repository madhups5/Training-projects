package com.npci.service;

import java.time.LocalDate;
import java.util.Scanner;
import com.npci.User;
import com.npci.exceptions.UserNotFoundException;
import com.npci.utility.UserOperationsFactory;

public class TestService {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		UserOperations userOperations= UserOperationsFactory.getInstance();
		int option=0;
		do
		{
			System.out.println("1:Store\n2:Find All\n3:Find By Name\nTo Exit Enter-1");
			option=scanner.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Your Name");
				String name=scanner.next();
				System.out.println("Enter Your Phone No");
				Long phno=scanner.nextLong();
				System.out.println("Enter Your DOB in yyyy-MM-dd Format Only");
				LocalDate dob=LocalDate.parse(scanner.next());
				User user=new User(name,phno,dob);
				int status= userOperations.store(user);
				if(status==1)
				{
					System.out.println("User Stored");
				}
				else
				{
					System.err.println("Failed to User");
				}
				break;
			case 2:
				User[] users=userOperations.findAll();
				for(User item:users)
				{
					System.out.println(item);
					System.out.println("_______________________________________________________");
				}
				break;
			case 3:
				System.out.println("Enter Name");
				name=scanner.next();
				try {
					user=userOperations.findUserByName(name);
					System.out.println(user.getName());
				} 
				catch(UserNotFoundException e)
				{
					System.err.println(e.getMessage());
				} 
				break;
			}
		}
		while(option!=-1);
	}

}
