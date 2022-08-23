package com.example.aplicativoform.control;


import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aplicativoform.classe.cliente;
import com.example.aplicativoform.service.produtoservice;


@RestController
@RequestMapping("/api")
public class ClienteControl {



@Autowired    
private produtoservice cliservice;

@PostMapping("/cli")
public String saveCli(@RequestBody cliente cli) throws ExecutionException, InterruptedException{
    return cliservice.saveCliente(cli);
}





}
