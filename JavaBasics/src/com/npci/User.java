package com.npci;

import java.time.LocalDate;

public class User {
	private String name;
	private long phno;
	private LocalDate dob;

	public User(String name, long phno) {
		super();
		this.name = name;
		this.phno = phno;
	}
	public User(String name, long phno,LocalDate dob) {
		super();
		this.name = name;
		this.phno = phno;
		this.dob=dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		if(dob==null)
		{
			return "User [name=" + name + ", phno=" + phno+"]";	
		}
		return "User [name=" + name + ", phno=" + phno + ", dob=" + dob + "]";
	}




}
