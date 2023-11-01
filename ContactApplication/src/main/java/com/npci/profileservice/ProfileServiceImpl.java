package com.npci.profileservice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.npci.exceptions.InvalidDetailsException;
import com.npci.profile.Profile;

public class ProfileServiceImpl implements ProfileService {
	Scanner scanner= new Scanner(System.in);
	Set<Profile> profiles= new HashSet<Profile>();
	
	List<Profile> pfs=new ArrayList<>();
	@Override
	public Profile saveProfile(Profile profile) {
		profiles.add(profile);
		return profile;	   
	}

	@Override
	public String deleteProfile(String email_id) {
		if( profiles.isEmpty()!=true) 
		{
			Iterator<Profile> iterator= profiles.iterator();
			while(iterator.hasNext())
			{
				Profile profile=iterator.next();
				if(profile.getEmail_id().equals(email_id));
				{
				profiles.remove(profile);
				}
			}
			return "Profile Deleted Successfully";
		}
		return "Profile_id Not found";
	}
	@Override 
	public String ShowAllProfiles()
	{
		if(profiles.isEmpty()!=true)
		{
		  for(Profile p: profiles)
		  {
			pfs.add(p);
			System.out.println(pfs);  
		  }
		}
		return "No profiles Created";
		
	}

	@Override
	public Profile Login(String email_id,String password) throws InvalidDetailsException {
		for(Profile profile:profiles) {
		if(profile.getEmail_id().equals(email_id) && profile.getPassword().equals(password))
		{
			return profile;
		}
		}
		throw new InvalidDetailsException("Invalid Profile ID and Password");
	}
}
