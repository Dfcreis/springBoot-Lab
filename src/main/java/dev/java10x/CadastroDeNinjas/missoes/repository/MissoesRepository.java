package dev.java10x.CadastroDeNinjas.missoes.repository;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MissoesRepository extends JpaRepository <MissoesModel, Long> {
}
