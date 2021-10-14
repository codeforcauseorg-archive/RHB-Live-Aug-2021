package com.redhat.demoheader.demo.controllers;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;

@CrossOrigin
@RestController
public class HomeController {

    public HomeController(){

        try {

            FileInputStream serviceAccount =
                    new FileInputStream("./service.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);

        } catch (Exception e){
            System.out.println("File not found");
        }

    }
    @GetMapping
    public FirebaseToken welcome(@RequestHeader("authorization") String authorization) throws Exception{


        FirebaseToken token = FirebaseAuth.getInstance().verifyIdToken(authorization.substring(7));

        return token;
    }
}
