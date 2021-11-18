package com.example.securedemo.controllers;

import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;


@RestController
@CrossOrigin("*")
public class HomeController {

    @GetMapping("/api/user/")
    public String hello(){
        return "okay";
    }

}
