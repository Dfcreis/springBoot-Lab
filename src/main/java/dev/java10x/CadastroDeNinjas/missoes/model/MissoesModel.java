package dev.java10x.CadastroDeNinjas.missoes.model;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dificuldade;

    //OneToMeny: Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes") //mapeando para onde enviar os Ninjas
    private List<NinjaModel> ninja;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String dificuldade, String name) {
        this.id = id;
        this.dificuldade = dificuldade;
        this.name = name;
        this.ninja = ninja;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "MissoesModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dificuldade='" + dificuldade + '\'' +
                '}';
    }
}
