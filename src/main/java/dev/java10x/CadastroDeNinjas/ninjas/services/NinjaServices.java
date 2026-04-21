package dev.java10x.CadastroDeNinjas.ninjas.services;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.mapper.NinjaMapper;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaServices  {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaServices(NinjaRepository ninjaRepository,NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Criar ninjas
    public NinjaDto criarNinja(NinjaDto ninjaDto){
        NinjaModel ninja =  ninjaMapper.map(ninjaDto);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
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


    //Altualizar ninja por id
    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaAtualiazado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualiazado.setId(id);
            return ninjaRepository.save(ninjaAtualiazado);
        }
        return null;
    }


}
