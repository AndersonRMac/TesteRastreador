package com.example.demo.controller;

import com.example.demo.service.TesteProtocolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Ultimo_dado_lido;
import com.example.demo.repository.Ult_dado_lidoRepository;

@RestController
@RequestMapping("/")
public class ProtocoloController {

    @Autowired
    Ult_dado_lidoRepository dao;

    TesteProtocolo testeProtocolo = new TesteProtocolo();

    @PostMapping
    public String post(String name){
        Ultimo_dado_lido ult = testeProtocolo.processaProtocol(name);
        System.out.print("SERIAL RASTREADOR : " + ult.getVEI_ID());
        dao.save(ult);
        return name;
    }
}
