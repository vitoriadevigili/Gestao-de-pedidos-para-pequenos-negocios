package com.app.cliente.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record AtualizarClienteRequest(

        @Size(max = 100, message = "Nome deve ter no máximo 100 caracteres")
        String nome,

        @Pattern(regexp = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$", message = "Telefone deve estar no formato (00) 0000-0000 ou (00) 00000-0000")
        String telefone,

        @Email(message = "Email inválido")
        @Size(max = 150)
        String email,

        Boolean exigeNotaFiscal,

        @Valid
        AtualizarEnderecoRequest endereco,

        Boolean ativo
) {
}
