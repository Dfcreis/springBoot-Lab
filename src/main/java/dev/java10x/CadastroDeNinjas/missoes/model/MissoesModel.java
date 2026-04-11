package dev.java10x.CadastroDeNinjas.missoes.model;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // construtor sem argumentos
@AllArgsConstructor // construtor com todos argumentos
@Data //gera os getters e setters
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dificuldade;

    //OneToMeny: Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes") //mapeando para onde enviar os Ninjas
    private List<NinjaModel> ninja;

}
