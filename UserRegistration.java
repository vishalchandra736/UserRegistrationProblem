package com.blz.userregistrationproblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserRegistration {
    public void checkFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        match(matcher.matches());
    }
    public void checkLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        match(matcher.matches());
    }
    public void checkEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.-_+]*[a-zA-Z0-9]*)[@][a-z]+[.][a-zA-Z]{2,4}+([.]*[a-zA-Z]{2,4})?$");
        Matcher matcher = pattern.matcher(email);
        match(matcher.matches());
    }
    public void checkPhoneNo(String phoneNo){
        Pattern pattern = Pattern.compile("^[0-9]{1,3}[\\s]{1}[0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNo);
        match(matcher.matches());
    }
    public void checkPassword(String password){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*.])[0-9a-zA-Z!@#$%^&*.]{8,}$");
        Matcher matcher = pattern.matcher(password);
        match(matcher.matches());
    }
    public static void match(boolean match) {
        if(match) {
            System.out.println("Valid Input");
        }
        else {
            System.out.println("InValid Input!!!");
        }
    }

    public void testMails() {
        checkEmail("abc@yahoo.com");
        checkEmail("abc");
        checkEmail("abc-100@yahoo.com");
        checkEmail("abc@.com.my");
        checkEmail("abc.100@yahoo.com");
        checkEmail("abc123@gmail.a");
        checkEmail("abc111@abc.com");
        checkEmail("abc123@.com");
        checkEmail("abc-100@abc.net");
        checkEmail("abc123@.com.com");
        checkEmail("abc.100@abc.com.au");
        checkEmail(".abc@abc.com");
        checkEmail("abc@1.com");
        checkEmail("abc()*@gmail.com");
        checkEmail("abc@gmail.com.com");
        checkEmail("abc@%*.com");
        checkEmail("abc+100@gmail.com");
        checkEmail("abc..2002@gmail.com");
        checkEmail("abc.@gmail.com");
        checkEmail("abc@abc@gmail.com");
        checkEmail("abc@gmail.com.1a");
        checkEmail("abc@gmail.com.aa.au");
    }
}


