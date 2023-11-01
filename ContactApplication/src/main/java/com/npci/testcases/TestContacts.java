package com.npci.testcases;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.npci.profile.Profile;
import com.npci.profileservice.ProfileService;
import com.npci.utility.ProfileOperationsFactory;


public class TestContacts {
	ProfileService ps= ProfileOperationsFactory.getInstance();
	@Test
	public void testSave() {
		
		String before=ps.ShowAllProfiles()e		Profile p=new Profile("ashok@gmail.com","ashok","111",LocalDate.parse("2001-04-05"), 303400404);
		ps.saveProfile(p);
		int after=ps.findall().size();
		assertTrue(before<after);
	}
	@Test
	public void testDel() {
		
		Profile p=new Profile("ash@gmail.com","ashok","111",null, 303400404);
		Profile p1=new Profile("varma@gmail.com","varma","121",null, 303400404);
		ps.save(p);
		ps.save(p1);
		int actualsize=ps.findall().size();
		
		ps.del("ash@gmail.com", "111");
		int afterdelsize=ps.findall().size();
		assertTrue(afterdelsize<=actualsize);
		
	}
	@Test
	public void testLogin() {
		Profile p=new Profile("ash@gmail.com","ashok","111",null, 303400404);
		Profile p1=new Profile("varma@gmail.com","varma","121",null, 303400404);
		ps.save(p);
		ps.save(p1);
		int loginval=ps.login("ash@gmail.com", "111");
		assertTrue(loginval!=0);
		
	}
	@Test
	public void testFindall() {
		
		Profile p=new Profile("ash@gmail.com","ashok","111",null, 89288292);
		Profile p1=new Profile("varma@gmail.com","varma","121",null, 919763673);
		Profile p2=new Profile("ashok@gmail.com","aaa","333",null, 782892873);
		ps.save(p);
		ps.save(p1);
		int find=ps.findall().size();
		assertTrue(find>=2);
}
