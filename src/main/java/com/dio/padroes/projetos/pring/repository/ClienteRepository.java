package com.dio.padroes.projetos.pring.repository;

import com.dio.padroes.projetos.pring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
