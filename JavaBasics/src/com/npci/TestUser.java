package com.npci;

import java.time.LocalDate;

public class TestUser {
	public static void main(String[] args) {

		User user= new User("Madhu",7660073637L);
		System.out.println(user);

		User user1= new User("Ram",9398144323L,LocalDate.of(1998, 11, 05));
		System.out.println(user1);

		User user2= new User("Laxman",8790118696L,LocalDate.parse("1998-11-05"));
		System.out.println(user2);

	}

}
