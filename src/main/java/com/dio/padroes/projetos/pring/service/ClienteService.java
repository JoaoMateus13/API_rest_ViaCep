package com.dio.padroes.projetos.pring.service;

import com.dio.padroes.projetos.pring.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Optional<Cliente> buscarPorId(Long id);

    void inserir(Cliente cliente);

    void delete(Long id);

    void atualizar(Long id, Cliente cliente);






}
