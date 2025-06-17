package com.example.authdemo1.controller;




import com.example.authdemo1.service.AuthService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // allow all frontend origins (or specify http://localhost:3000)
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request.getEmail(), request.getPassword());
    }

    @PostMapping("/reset-password")
    public String resetPassword(@RequestBody ResetPasswordRequest request) {
        return authService.resetPassword(request.getEmail(), request.getNewPassword());
    }
}

@Data
class LoginRequest {
    private String email;
    private String password;
}

@Data
class ResetPasswordRequest {
    private String email;
    private String newPassword;
}
