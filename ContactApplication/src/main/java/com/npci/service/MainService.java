package com.npci.service;

import java.time.LocalDate;
import java.util.Scanner;

import com.npci.exceptions.InavalidDetailsException;
import com.npci.exceptions.InvalidDetailsException;
import com.npci.profile.Profile;
import com.npci.profileservice.ProfileService;
import com.npci.profileservice.ProfileServiceImpl;
import com.npci.utility.ProfileOperationsFactory;

public class MainService {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		ProfileServiceImpl ProfileServiceImpl= new ProfileServiceImpl();
		ProfileService ProfileService=ProfileOperationsFactory.getInstance();
		int option=0;
		do
		{
			System.out.println("1:Save Profile\n2:delete Profile\n3:show All Profiles\n4:Login to your account\n:To Exit Enter-1");
			option=scanner.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter Your email_id");
				String email_id=scanner.next();
				System.out.println("Enter Your Name");
				String name=scanner.next();
				System.out.println("Enter Your Password");
				String password=scanner.next();
				System.out.println("Enter Your DOB in yyyy-MM-dd Format Only");
				LocalDate dob=LocalDate.parse(scanner.next());
				System.out.println("Enter Your Phno");
				long phno=scanner.nextLong();
				Profile profile= new Profile(email_id,name,password,dob,phno);	
				ProfileServiceImpl.saveProfile(profile);
				System.out.println(profile);
				break;

			case 2:
				System.out.println("Enter Email_Id to delete the profile");
				email_id= scanner.next();
				String message=ProfileServiceImpl.deleteProfile(email_id);
				System.out.println(message);

			case 3 :
				System.out.println(ProfileServiceImpl.ShowAllProfiles());
				break;

			case 4 : System.out.println("Enter your Email id and password to login to your account");
			email_id=scanner.next();s
			password=scanner.next();
			try {
				ProfileServiceImpl.Login(email_id, password);
			} catch (InvalidDetailsException e) {
				e.printStackTrace();
			}
			break;
			}

		}
		while(option!=-1);
	}


}
