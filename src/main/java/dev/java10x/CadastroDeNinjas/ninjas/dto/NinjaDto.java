package dev.java10x.CadastroDeNinjas.ninjas.dto;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDto {
    //DT0 é um objeto de transferência de dados, usado para transferir dados entre camadas da
    // aplicação, como entre o controlador e o serviço. Ele é usado para encapsular os dados
    // que serão enviados ou recebidos pela API, e pode ser diferente do modelo de entidade
    // usado para persistência no banco de dados.
    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    private String url;
    private String rank;
    private MissoesModel missoes;

}

