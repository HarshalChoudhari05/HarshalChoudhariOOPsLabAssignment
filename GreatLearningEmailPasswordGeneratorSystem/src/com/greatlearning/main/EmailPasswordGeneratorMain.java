package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class EmailPasswordGeneratorMain {

	static Employee emp = new Employee("Harshal", "Choudhari" , "Technical");
	static Scanner sc = new Scanner(System.in);
	static CredentialService credentialService = new CredentialService();

	public static void main(String[] args) {
		displayMenu();
	}

	public static void displayMenu() {
		System.out.println("Please Enter the Department from the Following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			emp.setDepartmentName("tech");
			System.out.println("Please Enter your first name");
			emp.setFirstName(sc.next());
			System.out.println("Please Enter your last name");
			emp.setLastName(sc.next());
			credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), emp.getDepartmentName());
			System.out.println("Dear " + emp.getFirstName() + " your credentials are as follows:");
			credentialService.showCredentials();
			break;
		case 2:
			emp.setDepartmentName("admin");
			System.out.println("Please Enter your first name");
			emp.setFirstName(sc.next());
			System.out.println("Please Enter your last name");
			emp.setLastName(sc.next());
			credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), emp.getDepartmentName());
			System.out.println("Dear " + emp.getFirstName() + " your credentials are as follows:");
			credentialService.showCredentials();
			break;
		case 3:
			emp.setDepartmentName("humanresource");
			System.out.println("Please Enter your first name");
			emp.setFirstName(sc.next());
			System.out.println("Please Enter your last name");
			emp.setLastName(sc.next());
			credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), emp.getDepartmentName());
			System.out.println("Dear " + emp.getFirstName() + " your credentials are as follows:");
			credentialService.showCredentials();
			break;
		case 4:
			emp.setDepartmentName("legal");
			System.out.println("Please Enter your first name");
			emp.setFirstName(sc.next());
			System.out.println("Please Enter your last name");
			emp.setLastName(sc.next());
			credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), emp.getDepartmentName());
			System.out.println("Dear " + emp.getFirstName() + " your credentials are as follows:");
			credentialService.showCredentials();
			break;
		default:
			System.out.println("Please Enter Correct Choice in a form of Sequence number like 1,2,3,4.");
		}
	}
}