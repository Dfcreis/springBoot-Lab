package dev.java10x.CadastroDeNinjas.ninjas.services;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaServices  {

    private NinjaRepository ninjaRepository;

    public NinjaServices(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Criar ninjas
    public NinjaModel criarninja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarTodosNinjas() {
        return ninjaRepository.findAll();
    }

    //Listar ninjas por id
    public NinjaModel listarNinjaPorId(Long id) {
           Optional<NinjaModel> ninjaOptional = ninjaRepository.findById(id);
           return ninjaOptional.orElse(null);
    }

    //Deletar ninjas por id
    public void deletarNinja(Long id){
       ninjaRepository.deleteById(id);
    }

}
