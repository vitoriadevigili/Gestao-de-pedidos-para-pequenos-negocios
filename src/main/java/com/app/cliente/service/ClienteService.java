package com.app.cliente.service;

import com.app.cliente.model.dto.AtualizarClienteRequest;
import com.app.cliente.model.dto.ClienteResponse;
import com.app.cliente.model.dto.CriarClienteRequest;
import com.app.cliente.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteResponse> listarTodos() {
        return new ArrayList<>();
    }

    public ClienteResponse buscarPorId(Long id) {
        return new ClienteResponse(
                null, null, null, null, null, null, null, null);
    }

    public ClienteResponse salvar(@Valid CriarClienteRequest cliente) {
        return new ClienteResponse(
                null, null, null, null, null, null, null, null);
    }

    public ClienteResponse atualizar(Long id, @Valid AtualizarClienteRequest cliente) {
        return new ClienteResponse(
                null, null, null, null, null, null, null, null);
    }

    public void deletar(Long id) {
    }
}
