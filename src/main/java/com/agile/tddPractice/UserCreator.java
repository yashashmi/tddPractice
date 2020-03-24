package com.agile.tddPractice;

import java.util.HashMap;

public class UserCreator {

    HashMap<String, String> UserData = new HashMap<String, String>();

    public String CreateUser(String userName, String password) {
        if (isUserNameValid(userName) && !password.isEmpty() && doesPasswordMinimumLength(password) && passwordHasAlphabets(password) && passwordHasOneNumeric(password)) {
            UserData.put(userName, password);
            return "User Created Successfuly";
        }
        return "User Creation Failed";
    }

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

    public String getUser(String userName) {

        return UserData.get(userName);
    }

    public HashMap<String, String> getUserData() {
        return UserData;
    }

    public boolean doesPasswordMinimumLength(String password) {
        if (password.length() > 5) {
            return true;
        }
        return false;
    }

	public boolean passwordHasAlphabets(String password) {
        char[] passwordCharArray = password.toCharArray();
        boolean atLeastOneChar = false;

        for (char ch : passwordCharArray) {
            if (Character.isAlphabetic(ch)) {
                atLeastOneChar = true;
            }
        }
        return atLeastOneChar;
	}

	public boolean passwordHasOneNumeric(String password) {
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