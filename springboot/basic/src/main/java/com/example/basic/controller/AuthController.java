package com.example.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.basic.dto.JsonResponse;
import com.example.basic.dto.UserCreateRequest;
import com.example.basic.dto.UserLoginRequest;
import com.example.basic.model.User;
import com.example.basic.service.UserService;
import com.example.basic.util.JwtService;
import jakarta.validation.Valid;
@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody UserCreateRequest request) {
        User user = service.createUser(request.getEmail(), request.getPassword());
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<JsonResponse<String>> login(@Valid @RequestBody UserLoginRequest request) {
        String email = request.getEmail();
        String password = request.getPassword();

        User user = service.authenticate(email, password);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(new JsonResponse<>(false, null, "Invalid credentials"));
        }
        String token = jwtService.generateToken(email);
        return ResponseEntity.ok(new JsonResponse<>(true, token, null));
    }
}