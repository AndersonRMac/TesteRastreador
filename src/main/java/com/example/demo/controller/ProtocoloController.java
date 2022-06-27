package com.example.demo.controller;

import com.example.demo.service.TesteProtocolo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProtocoloController {

    TesteProtocolo testeProtocolo = new TesteProtocolo();

    @PostMapping
    public String post(String name){
        String retornoProtocol = testeProtocolo.processaProtocol(name);
        System.out.println(retornoProtocol);
        return name;
    }
}
