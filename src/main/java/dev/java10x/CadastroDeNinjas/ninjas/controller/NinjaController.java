package dev.java10x.CadastroDeNinjas.ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping(value = "/boas-vindas")
    public String boasVindas() {
        return "Esta e minha primeira mensagem nesta rota";
    }

}
