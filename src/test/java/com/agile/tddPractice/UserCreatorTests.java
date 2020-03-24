package com.agile.tddPractice;

import static org.junit.Assert.assertEquals;
//import org.junit.Assert;
import org.junit.Test;

public class UserCreatorTests {

    @Test
    public void getSuccessMessage() {
        // Arrange
        UserCreator userCreator = new UserCreator();
        // Act
        String result = userCreator.CreateUser("John", "abcd123");
        // Assert
        assertEquals("User Created Successfuly", result);
    }

    @Test
    public void getFailureMessage() {
        // Arrange
        UserCreator userCreator = new UserCreator();
        // Act
        String result = userCreator.CreateUser("John123", "123");
        // Assert
        assertEquals("User Creation Failed", result);
    }

    @Test
    public void userCreationFailedWhenPasswordIsEmpty() {
        UserCreator userCreator = new UserCreator();
        String result = userCreator.CreateUser("John", "");

        assertEquals("User Creation Failed", result);

    }

    @Test
    public void userCreatedSuccessfullyWhenValidPassword() {
        UserCreator userCreator = new UserCreator();
        String result = userCreator.CreateUser("John", "abcd123");

        assertEquals("User Created Successfuly", result);

    }

    
}