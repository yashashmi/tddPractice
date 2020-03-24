package com.agile.tddPractice;

public class UserInputValidator {

    public boolean isUserNameValid(String userName) {
        boolean atLeastOneNumber = false;
        char[] userNameCharArray = userName.toCharArray();

        for (char ch : userNameCharArray) {
            if (Character.isDigit(ch)) {
                atLeastOneNumber = true;
            }
        }

        return !atLeastOneNumber;
    }

    public boolean isValidPassword(String password) {
        if (!password.isEmpty() && doesPasswordMinimumLength(password) && passwordHasAlphabets(password)
                && passwordHasOneNumeric(password)) {
            return true;
        }

        return false;
    }

    private boolean doesPasswordMinimumLength(String password) {
        if (password.length() > 5) {
            return true;
        }
        return false;
    }

    private boolean passwordHasAlphabets(String password) {
        char[] passwordCharArray = password.toCharArray();
        boolean atLeastOneChar = false;

        for (char ch : passwordCharArray) {
            if (Character.isAlphabetic(ch)) {
                atLeastOneChar = true;
            }
        }
        return atLeastOneChar;
    }

    private boolean passwordHasOneNumeric(String password) {
        boolean atLeastOneNumber = false;
        char[] passwordCharArray = password.toCharArray();

        for (char ch : passwordCharArray) {
            if (Character.isDigit(ch)) {
                atLeastOneNumber = true;
            }
        }

        return atLeastOneNumber;
    }

}