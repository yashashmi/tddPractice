package com.agile.tddPractice;

import java.util.HashMap;

public class UserCreator {

    HashMap<String,String> UserData = new HashMap<String,String>();

    public String CreateUser(String userName, String password) {
        if (isUserNameValid(userName) && !password.isEmpty()) {
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

	
}