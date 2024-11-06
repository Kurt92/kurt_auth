package com.jt.sdfor_auth.biz.controller;

import com.jt.sdfor_auth.biz.dto.LoginDTO;
import com.jt.sdfor_auth.biz.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/auth/login")
    public String login(@RequestBody LoginDTO.Request loginDTO) {
            loginService.login(loginDTO);
        return null;
    }
}
