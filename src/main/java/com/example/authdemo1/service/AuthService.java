package com.example.authdemo1.service;



public interface AuthService {
    String login(String email, String password);
    String resetPassword(String email, String newPassword);
}
