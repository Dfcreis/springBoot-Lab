package dev.java10x.CadastroDeNinjas.missoes.services;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import dev.java10x.CadastroDeNinjas.missoes.repository.MissoesRepository;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesServices {

    private MissoesRepository missoesRepository;

    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

//Listar todas as missoes
    public List<MissoesModel> listarTodasMissoes() {
        return missoesRepository.findAll();
    }
//Listar missao por id
    public MissoesModel ListarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesOptional = missoesRepository.findById(id);
        return missoesOptional.orElse(null);
    }
//Criar novas missoes
    public MissoesModel criarMissao(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }
//Deletar missao por id
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }
//Atualizar missao por id
    public MissoesModel atualizarMissoes(Long id,MissoesModel missoesAtualizada){

      if(missoesRepository.existsById(id)){

          missoesAtualizada.setId(id);
          return missoesRepository.save(missoesAtualizada);
      }
      return null;
    }


}
