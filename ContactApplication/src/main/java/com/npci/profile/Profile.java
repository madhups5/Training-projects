package com.npci.profile;

import java.time.LocalDate;

public class Profile {
	private String email_id;
	private String name;
	private String password;
	private LocalDate dob;
	private long phno;

	public Profile(String email_id, String name, String password, LocalDate dob, long phno) {
		super();
		this.email_id = email_id;
		this.name = name;
		this.password = password;
		this.dob = dob;
		this.phno = phno;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id=email_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Profile [email_id=" + email_id + ", name=" + name + ", password=" + password + ", dob=" + dob
				+ ", phno=" + phno + "]";
	}

}
