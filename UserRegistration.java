package com.blz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserRegistration {

    public String firstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        if(matcher.matches()) {
            return "Valid Input";
        }
        return "Invalid Input!!!";
    }
    public String lastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        if(matcher.matches()) {
            return "Valid Input";
        }
        return "Invalid Input!!!";
    }
    public String email(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.-_+]*[a-zA-Z0-9]*)[@][a-z]+[.][a-zA-Z]{2,4}+([.]*[a-zA-Z]{2,4})?$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            return "Valid Input";
        }
        return "Invalid Input!!!";
    }
}


