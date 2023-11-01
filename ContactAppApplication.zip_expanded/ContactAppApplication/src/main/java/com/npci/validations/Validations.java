package com.npci.validations;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	
	public static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
		{
			return true;
		}
		return false;
	}

	public static boolean validateName(String name) {
		if (name == null || name.length() < 5 && name.length() > 60) {
			throw new IllegalArgumentException("Name must be between 5 and 60 characters.");
		}
		return true;
	}
 
	public static boolean validatePassword(String password) {
		if (password.length() < 6) {
			return false;
		}

		// Use regular expressions to check for uppercase, lowercase, digit, and special
		// symbol
		String regex = "^(?=.[A-Z])(?=.[a-z])(?=.\\d)(?=.[@#$%^&+=]).*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);

		return matcher.matches();

	}

	public static boolean isDateValid(LocalDate date) {
		try {
//	            // Parse the input date
//	            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

			// Calculate the current date
			LocalDate currentDate = LocalDate.now();

			// Calculate the date 18 years ago
			LocalDate eighteenYearsAgo = currentDate.minus(Period.ofYears(18));

			// Check if the input date is at least 18 years in the past
			return date.isBefore(eighteenYearsAgo);
		} catch (DateTimeParseException e) {
			// Invalid date format
			return false;
		}
	}

	public static boolean validatePhone(long phone) {
		String myString = Long.toString(phone);
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(myString);

		if (!matcher.matches()) {
			throw new IllegalArgumentException("Phone must be a 10-digit number.");
		}
		return true;
	}

}
