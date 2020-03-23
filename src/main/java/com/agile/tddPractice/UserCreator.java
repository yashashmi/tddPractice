package com.agile.tddPractice;

public class UserCreator {

    public String CreateUser(String userName) {
        if (isUserNameValid(userName)) {
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
}