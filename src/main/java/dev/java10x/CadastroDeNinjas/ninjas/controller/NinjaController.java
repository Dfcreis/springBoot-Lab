package dev.java10x.CadastroDeNinjas.ninjas.controller;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.services.NinjaServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaServices ninjaServices;

    public NinjaController(NinjaServices ninjaServices) {
        this.ninjaServices = ninjaServices;
    }

    @GetMapping(value = "/boas-vindas")
    public String boasVindas() {
        return "Esta e minha primeira mensagem nesta rota";
    }

    //CRUD
    //Adicionar Ninja {CREATE}
    @PostMapping("/criar")
    public String adicionarNinja() {
        return "Ninja adicionado com sucesso!";
    }

    //Procurar Ninja por ID {CREATE}
    @GetMapping("/procurar")
    public String mostrarNinjaPorId() {
        return "Ninja encontrado com sucesso!";
    }

    //Mostras todos os ninjas {READ}
    @GetMapping("/mostrar-todos")
    public List<NinjaModel> mostraTodosNinjas() {
        return ninjaServices.listarTodosNinjas();
    }


    //Alterar Ninja {UPDATE}
    @PutMapping("/alterar")
    public String alterarNinjaId() {
        return "Ninja alterado com sucesso!";
    }


    //Deletar Ninja {DELETE}
    @DeleteMapping("/deletar")
    public String deletarNinjaId() {
        return "Ninja deletado com sucesso!";
    }


}
