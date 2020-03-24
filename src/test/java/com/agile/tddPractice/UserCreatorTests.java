package com.agile.tddPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void test() {
        UserCreator userCreator = new UserCreator();
        userCreator.CreateUser("John", "abcd123");

        String result2 = userCreator.getUser("John");

        assertNotNull(result2);

    }

    @Test
    public void shouldReturnCorrectCorrespondingPassword() {
        UserCreator userCreator = new UserCreator();
        userCreator.CreateUser("John", "abcd123");

        String result = userCreator.getUser("John");

        assertEquals("abcd123", result);
    }

    @Test
    public void returnTrueWhenLengthOfPasswordGreaterThan5() {

        UserCreator userCreator = new UserCreator();
        boolean result = userCreator.doesPasswordMinimumLength("abcde123");

        assertTrue(result);
    }

    @Test
    public void returnFalseWhenMinimumCriteriaNotMet() {

        UserCreator userCreator = new UserCreator();
        boolean result = userCreator.doesPasswordMinimumLength("ab1");

        assertFalse(result);
    }

    @Test
    public void returnTrueWhenPasswordHas1Alphabet()
    {
        UserCreator userCreator = new UserCreator();
        boolean result = userCreator.passwordHasAlphabets("abcde123");

        assertTrue(result);
    }

    @Test
    public void returnFalseWhenNoAlphabets()
    {
        UserCreator userCreator = new UserCreator();
        boolean result = userCreator.passwordHasAlphabets("123456");

        assertFalse(result);
    }


    @Test
    public void returnTrueWhenPasswordHas1Numeric()
    {
        UserCreator userCreator = new UserCreator();
        boolean result = userCreator.passwordHasOneNumeric("abcde123");

        assertTrue(result);
    }

    @Test
    public void returnFalseWhenThereIsNotNumericInPassword()
    {
        UserCreator userCreator = new UserCreator();
        boolean result = userCreator.passwordHasOneNumeric("abcdefg");

        assertFalse(result);
    }

}