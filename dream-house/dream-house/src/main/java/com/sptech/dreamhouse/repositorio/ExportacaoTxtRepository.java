package com.sptech.dreamhouse.repositorio;

import com.sptech.dreamhouse.entidade.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExportacaoTxtRepository extends JpaRepository<Anuncio, Integer> {


}