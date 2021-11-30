package com.greatlearning.service;

import java.util.Random;

public class CredentialService {

	final private String companyName = ".greatlearning.com";
	private String emailAddress = "";

	/**
	 * Generates 8 character long password randomly
	 * 
	 * @return generatedPassword
	 */
	public String generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*_=-<>";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < 8; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		 String generatedPassword = new String(password);
		return generatedPassword;
	}

	/**
	 * Generates email address for an employee with specific department.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param departmentName
	 */
	public void generateEmailAddress(String firstName, String lastName, String departmentName) {
		this.emailAddress = firstName + lastName + "@" + departmentName + this.companyName;
	}

	/**
	 * Displays Email and Password generated for an employee
	 */
	public void showCredentials() {
		System.out.println("Email	 --> " + emailAddress);
		System.out.println("Password --> " + generatePassword());
	}
}
