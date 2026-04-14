package dev.java10x.CadastroDeNinjas.missoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

@GetMapping
    public String mostrarMissoes(){
    return "Estas sao as missoes";
}

}
