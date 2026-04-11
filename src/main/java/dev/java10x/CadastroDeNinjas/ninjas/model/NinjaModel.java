package dev.java10x.CadastroDeNinjas.ninjas.model;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Trasforma classe em entidade no banco de dados
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)//Coluna unica, não pode repetir
    private String email;

    private Integer idade;

    //ManytoOne:Um ninja pode ter apenas uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")//chave estrangeira
    private MissoesModel missoes;

}
