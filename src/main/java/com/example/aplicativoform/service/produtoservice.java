package com.example.aplicativoform.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.aplicativoform.classe.cliente;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;

@Service
public class produtoservice {
    private static final String COLLECTION_NAME  = "cliente";

            public String saveCliente(cliente  cli) throws InterruptedException, ExecutionException {

                Firestore dbFirestore= com.google.firebase.cloud.FirestoreClient.getFirestore();
                
                ApiFuture<WriteResult> collectionApiFuture=dbFirestore.collection(COLLECTION_NAME).document(cli.getNome()).set(cli);
                
                return collectionApiFuture.get().getUpdateTime().toString();

            } 

}
