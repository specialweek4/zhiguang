package com.tongji.auth.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import com.tongji.auth.model.ClientInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
@RequiredArgsConstructor
public class AuthController {

    //TODO
    public SendCodeResponse sendCode() {
    }

    @PostMapping()
    public AuthResponse register() {
    }

    @PostMapping()
    public AuthResponse login() {
    }

    @PostMapping()
    public TokenResponse refresh() {
    }

    @PostMapping()
    public  logout() {
    }


    @PostMapping()
    public ResponseEntity<Void> resetPassword(@Valid @RequestBody PasswordResetRequest request) {
        authService.resetPassword(request);
        return ResponseEntity.noContent().build();
    }

    public AuthUserResponse me() {
   
    }

    private ClientInfo resolveClient(HttpServletRequest request) {

    }

    private String extractClientIp(HttpServletRequest request) {

    }
}
