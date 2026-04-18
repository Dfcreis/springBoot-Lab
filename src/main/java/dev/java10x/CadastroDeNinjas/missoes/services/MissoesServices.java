package dev.java10x.CadastroDeNinjas.missoes.services;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesServices {
    private MissoesRepository missoesRepository;

    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }


    public List<MissoesModel> listarTodasMissoes() {
        return missoesRepository.findAll();
    }

    public MissoesModel ListarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesOptional = missoesRepository.findById(id);
        return missoesOptional.orElse(null);
    }


}
