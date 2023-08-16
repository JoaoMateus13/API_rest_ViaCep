package com.dio.padroes.projetos.pring.repository;

import com.dio.padroes.projetos.pring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository <Endereco, String> {

}
