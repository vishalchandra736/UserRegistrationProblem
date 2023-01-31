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
        userRegistration.checkFirstName(firstName);
        System.out.println("Enter the Last Name (start with capital and has min 3 character) : " );
        String lastName = getUserInput();
        userRegistration.checkLastName(lastName);
        System.out.println("Enter the E-mail : " );
        String email = getUserInput();
        userRegistration.checkEmail(email);
        System.out.println("Enter the Phone No (country code follow by space and 10 digit number): " );
        String phoneNo = getUserInput();
        userRegistration.checkPhoneNo(phoneNo);
        System.out.println("Enter the Password (min 8 char and atleast 1 uppercase letter) : " );
        String password = getUserInput();
        userRegistration.checkPassword(password);
    }
}
