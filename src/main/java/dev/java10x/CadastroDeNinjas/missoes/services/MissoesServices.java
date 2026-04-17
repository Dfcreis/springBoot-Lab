package dev.java10x.CadastroDeNinjas.missoes.services;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesServices {
    private MissoesRepository missoesRepository;

    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }


    public List<MissoesModel> listarTodasMissoes() {
        return missoesRepository.findAll();
    }


}
