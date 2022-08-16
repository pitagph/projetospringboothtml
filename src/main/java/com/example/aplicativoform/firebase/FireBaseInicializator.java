package com.example.aplicativoform.firebase;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


@Service
public class FireBaseInicializator {

    @PostConstruct
    public void ini(){
      try {
         FileInputStream serviceAccount =
        new FileInputStream("./serviceAccountKey.json");
        FirebaseOptions options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .build();
        FirebaseApp.initializeApp(options);
      } catch (Exception e) {
        e.printStackTrace();
          }

    } 
}