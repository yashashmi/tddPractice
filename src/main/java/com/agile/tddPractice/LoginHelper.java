package com.agile.tddPractice;

public class LoginHelper {

    private UserCreator userCreator;

    public LoginHelper(UserCreator userCreator) {
        this.userCreator = userCreator;
    }

    public String login(String userName, String password) {
        if (userCreator.UserData.containsKey(userName) && password.equals(userCreator.UserData.get(userName))) {
            return "Login Successful";
        }
        return "Login Failed";
    }

}
