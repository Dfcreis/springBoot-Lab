package dev.java10x.CadastroDeNinjas.ninjas.mapper;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    //O NinjaMapper é uma classe responsável por converter objetos do tipo NinjaDto
    // em objetos do tipo NinjaModel, e vice-versa. Ele é usado para mapear os dados
    // entre as camadas da aplicação, garantindo que os dados sejam transferidos
    // corretamente entre o controlador, serviço e repositório.
    public NinjaModel map(NinjaDto ninjaDto){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDto.getId());
        ninjaModel.setNome(ninjaDto.getNome());
        ninjaModel.setEmail(ninjaDto.getEmail());
        ninjaModel.setIdade(ninjaDto.getIdade());
        ninjaModel.setUrl(ninjaDto.getUrl());
        ninjaModel.setRank(ninjaDto.getRank());
        ninjaModel.setMissoes(ninjaDto.getMissoes());

        return ninjaModel;
    }


    public NinjaDto map (NinjaModel ninjaModel){
        NinjaDto ninjaDto = new NinjaDto();
        ninjaDto.setId(ninjaModel.getId());
        ninjaDto.setNome(ninjaModel.getNome());
        ninjaDto.setEmail(ninjaModel.getEmail());
        ninjaDto.setIdade(ninjaModel.getIdade());
        ninjaDto.setUrl(ninjaModel.getUrl());
        ninjaDto.setRank(ninjaModel.getRank());
        ninjaDto.setMissoes(ninjaModel.getMissoes());

        return ninjaDto;
    }




}
