package com.blz.userregistrationproblem;

import java.util.Scanner;

public class UserRegistrationProblem {
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static void main(String[] args) {
        UserRegistration userRegistration  = new UserRegistration();
        System.out.println("Welcome to User Registration System");
        System.out.println("Enter the First Name (start with capital and has min 3 character) : " );
        String firstName = getUserInput();
        System.out.println(userRegistration.firstName(firstName));
        System.out.println("Enter the Last Name (start with capital and has min 3 character) : " );
        String lastName = getUserInput();
        System.out.println(userRegistration.lastName(lastName));
        System.out.println("Enter the E-mail : " );
        String email = getUserInput();
        System.out.println(userRegistration.email(email));
        System.out.println("Enter the Phone No (country code follow by space and 10 digit number): " );
        String phoneNo = getUserInput();
        System.out.println(userRegistration.checkPhoneNo(phoneNo));
    }
}
