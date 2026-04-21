package dev.java10x.CadastroDeNinjas.ninjas.services;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.mapper.NinjaMapper;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public List<NinjaDto> listarTodosNinjas() {
       List <NinjaModel> ninja = ninjaRepository.findAll();

         return ninja.stream()
                 .map(ninjaMapper::map)
                 .collect(Collectors.toList());
    }

    //Listar ninjas por id
    public NinjaDto listarNinjaPorId(Long id) {
           Optional<NinjaModel> ninjaOptional = ninjaRepository.findById(id);

           return ninjaOptional
                   .map(ninjaMapper::map)
                   .orElse(null);
    }

    //Deletar ninjas por id
    public void deletarNinja(Long id){
       ninjaRepository.deleteById(id);
    }


    //Altualizar ninja por id
    public NinjaDto atualizarNinja(Long id,NinjaDto ninja) {
        Optional<NinjaModel> ninjaOptional = ninjaRepository.findById(id);

        if(ninjaOptional.isPresent()){

            NinjaModel ninjaAtualizado = ninjaMapper.map(ninja);
            ninjaAtualizado.setId(ninja.getId());

            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }

        return null;
    }


}
