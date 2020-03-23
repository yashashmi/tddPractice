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
        UserCreator userCreator = new UserCreator();
        // Act
        String result = userCreator.CreateUser("John");
        // Assert
        assertEquals("User Created Successfuly", result);
    }

    @Test
    public void getFailureMessage() {
        // Arrange
        UserCreator userCreator = new UserCreator();
        // Act
        String result = userCreator.CreateUser("John123");
        // Assert
        assertEquals("User Creation Failed", result);
    }

    @Test
    public void userNameShouldContainOnlyLetters() {

        // Arrange
        UserCreator userCreator = new UserCreator();

        // Act
        boolean result = userCreator.isUserNameValid("John");

        // Assert
        assertTrue(result);

    }

    @Test
    public void userNameNotLetters() {

        // Arrange
        UserCreator userCreator = new UserCreator();

        // Act
        boolean result = userCreator.isUserNameValid("John123");

        // Assert
        assertFalse(result);

    }

}