package dev.java10x.CadastroDeNinjas.missoes.controller;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.services.MissoesServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesServices missoesServices;

    public MissoesController(MissoesServices missoesServices) {
        this.missoesServices = missoesServices;
    }

    @GetMapping
    public String mostrarMissoes() {
        return "Estas sao as missoes";
    }

    //mostrar missoes
    @GetMapping("/mostrar_missoes")
    public List<MissoesModel> mostrarMissoesModel() {
        return missoesServices.listarTodasMissoes();
    }

    //Listar missoes por id
    @GetMapping("procurar/{id}")
    public MissoesModel procurarPorID(@PathVariable Long id) {
        return missoesServices.ListarMissoesPorId(id);
    }




}
