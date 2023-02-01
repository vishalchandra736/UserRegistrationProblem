package com.blz.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;
import com.blz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
    public class UserRegistrationWithParameterizeTest {
        public UserRegistration check;
        public String email;
        public boolean result;

        public UserRegistrationWithParameterizeTest (String email, boolean result) {
            super();
            this.email = email;
            this.result = result;
        }

        @Before
        public void initialise() {
            check = new UserRegistration();
        }

        @Test
        public void testWhenEmail_isEntered_returnAppropriateResult() {
            boolean match = check.checkEmail(email);
            Assert.assertEquals(match, result);

        }

        @Parameterized.Parameters
        public static Collection input() {
            return Arrays.asList(new Object[][] {
                    {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
                    {"abc", false}, {"abc@.com.my", false}, {"abc.100@yahoo.com", true},
                    {"abc123@gmail.a", false}, {"abc111@abc.com", true}, {"abc123@.com", false},
                    {"abc-100@abc.net", true}, {"abc123@.com.com", false},
                    {"abc.100@abc.com.au", false}, {".abc@abc.com", false},
                    {".abc@abc.com", false}, {"c", false}, {"abc()*@gmail.com", false},
                    {"abc@gmail.com.com", false}, {"abc@%*.com", false},
                    {"abc+100@gmail.com", true}, {"abc..2002@gmail.com", true},
                    {"abc.@gmail.com", true}, {"abc@abc@gmail.com", false},
                    {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}
            });
        }

    }
