package dev.java10x.CadastroDeNinjas.ninjas.repository;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository <NinjaModel, Long> {
}
