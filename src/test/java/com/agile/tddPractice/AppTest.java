package com.agile.tddPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void getSuccessMessage() {
        // Arrange
        A a = new A();
        // Act
        String result = a.GetMessage("John");
        // Assert
        assertEquals("User Created Successfuly", result);
    }

    @Test
    public void getFailureMessage() {
        // Arrange
        A a = new A();
        // Act
        String result = a.GetMessage("John123");
        // Assert
        assertEquals("User Creation Failed", result);
    }

    @Test
    public void userNameShouldContainOnlyLetters() {

        // Arrange
        A a = new A();

        // Act
        boolean result = a.userNameValid("John");

        // Assert
        assertTrue(result);

    }

    @Test
    public void userNameNotLetters() {

        // Arrange
        A a = new A();

        // Act
        boolean result = a.userNameValid("John123");

        // Assert
        assertFalse(result);

    }

    class A {

        public String GetMessage(String userName) {
            if (userNameValid(userName)) {
                return "User Created Successfuly";
            }
            return "User Creation Failed";
        }

        public boolean userNameValid(String userName) {
            boolean atLeastOneNumber = false;
            char[] userNameCharArray = userName.toCharArray();

            for (char ch : userNameCharArray) {
                if (Character.isDigit(ch)) {
                    atLeastOneNumber = true;
                }
            }

            return !atLeastOneNumber;
        }
    }

}