package com.agile.tddPractice;

import java.util.HashMap;

public class UserCreator {

    HashMap<String, String> UserData = new HashMap<String, String>();
    UserInputValidator validator;

    public UserCreator()
    {
         validator = new UserInputValidator();
    }
    public String CreateUser(String userName, String password) {
        if (validator.isUserNameValid(userName) && validator.isValidPassword(password)) {
            UserData.put(userName, password);
            return "User Created Successfuly";
        }
        return "User Creation Failed";
    }

    public HashMap<String, String> getUserData() {
        return UserData;
    }

}