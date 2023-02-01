package com.blz.userregistrationtest;

import com.blz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenIsProper_shouldReturnTure() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Vishal");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_whenIsNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("1123vishal");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_whenIsProper_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Chandra");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_whenIsNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Chandra321");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_whenIsProper_shouldReturnTure() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEmail("vishal@gmail.com");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_whenIsNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEmail("vishalgmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPhoneNo_whenIsProper_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPhoneNo("91 9171121211");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNo_whenIsNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPhoneNo("911122121212");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_whenIsProper_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPassword("Vishal123*");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_whenIsNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPassword("chandra12");
        Assert.assertEquals(false, result);
    }
}
