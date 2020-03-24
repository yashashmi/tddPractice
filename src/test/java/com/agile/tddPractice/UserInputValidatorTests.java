package com.agile.tddPractice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import org.junit.Assert;
import org.junit.Test;

public class UserInputValidatorTests{

    @Test
    public void userNameShouldContainOnlyLetters() {

        // Arrange
        UserInputValidator validator = new UserInputValidator();

        // Act
        boolean result = validator.isUserNameValid("John");

        // Assert
        assertTrue(result);

    }

    @Test
    public void userNameNotLetters() {

        // Arrange
        UserInputValidator validator = new UserInputValidator();
        // Act
        boolean result = validator.isUserNameValid("John123");

        // Assert
        assertFalse(result);

    }

   
    @Test
    public void returnTrueWhenLengthOfPasswordGreaterThan5() {

        UserInputValidator validator = new UserInputValidator();
        boolean result = validator.isValidPassword("abcde123");

        assertTrue(result);
    }

    @Test
    public void returnFalseWhenMinimumCriteriaNotMet() {

        UserInputValidator validator = new UserInputValidator();
        boolean result = validator.isValidPassword("ab1");

        assertFalse(result);
    }

    @Test
    public void returnTrueWhenPasswordHas1Alphabet()
    {
        UserInputValidator validator = new UserInputValidator();
        boolean result = validator.isValidPassword("abcde123");

        assertTrue(result);
    }

    @Test
    public void returnFalseWhenNoAlphabets()
    {
        UserInputValidator validator = new UserInputValidator();
        boolean result = validator.isValidPassword("123456");

        assertFalse(result);
    }


    @Test
    public void returnTrueWhenPasswordHas1Numeric()
    {
        UserInputValidator validator = new UserInputValidator();
        boolean result = validator.isValidPassword("abcde123");

        assertTrue(result);
    }

    @Test
    public void returnFalseWhenThereIsNotNumericInPassword()
    {
        UserInputValidator validator = new UserInputValidator();
        boolean result = validator.isValidPassword("abcdefg");

        assertFalse(result);
    }

}