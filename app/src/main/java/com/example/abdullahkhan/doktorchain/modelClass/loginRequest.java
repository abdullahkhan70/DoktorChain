package com.example.abdullahkhan.doktorchain.modelClass;

public class loginRequest {
    private String email;
    private String password;

    public loginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
