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
}


