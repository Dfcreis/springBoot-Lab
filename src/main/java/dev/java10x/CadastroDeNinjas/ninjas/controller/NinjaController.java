package dev.java10x.CadastroDeNinjas.ninjas.controller;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
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
    public NinjaDto adicionarNinja(@RequestBody NinjaDto ninjaDto) {
        return ninjaServices.criarNinja(ninjaDto);
    }

    //Procurar Ninja por ID {CREATE}
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id) {
        return ninjaServices.listarNinjaPorId(id);
    }

    //Mostras todos os ninjas {READ}
    @GetMapping("/listar")
    public List<NinjaModel> mostraTodosNinjas() {
        return ninjaServices.listarTodosNinjas();
    }


    //Alterar Ninja {UPDATE}
    @PutMapping("/alterar")
    public String alterarNinjaId() {
        return "Ninja alterado com sucesso!";
    }


    //Atualizar Ninja {UPDATE}
   @PutMapping("/atualizar/{id}")
   public NinjaModel atualizar(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaServices.atualizarNinja(id, ninjaAtualizado);
   }


    //Deletar Ninja {DELETE}
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaId(@PathVariable Long id) {
        ninjaServices.deletarNinja(id);
    }


}
