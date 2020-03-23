package com.agile.tddPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

//import org.junit.Assert;
import org.junit.Test;

public class LoginHelperTests {

    @Test
    public void successMessageOnSuccessfullLogin() {
        UserCreator userCreator = new UserCreator();
        userCreator.CreateUser("John", "1234");

        LoginHelper loginHelper = new LoginHelper(userCreator);

        String result = loginHelper.login("John", "1234");

        assertEquals("Login Successful", result);

    }

    @Test
    public void failureMessageWhenInvalidUserName() {

        UserCreator userCreator = new UserCreator();
        userCreator.CreateUser("John", "1234");

        LoginHelper loginHelper = new LoginHelper(userCreator);

        String result = loginHelper.login("Raj", "1234");

        assertEquals("Login Failed", result);

    }

    @Test
    public void failureMessageWhenPasswordIsIncorrect() {

        UserCreator userCreator = new UserCreator();
        userCreator.CreateUser("John", "1234");

        LoginHelper loginHelper = new LoginHelper(userCreator);

        String result = loginHelper.login("John", "12345");

        assertEquals("Login Failed", result);

    }


}