package com.app.cliente.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CNPJ;


public record CriarClienteRequest(

        @NotBlank(message = "Nome é obrigatório")
        @Size(max = 100, message = "Nome deve ter no máximo 100 caracteres")
        String nome,

        @Size(max = 18, message = "CNPJ deve ter no máximo 18 caracteres")
        @Pattern(regexp = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$", message = "CNPJ deve estar no formato 00.000.000/0000-00")
        @CNPJ(message = "CNPJ inválido")
        String cnpj,

        @Pattern(regexp = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$", message = "Telefone deve estar no formato (00) 0000-0000 ou (00) 00000-0000")
        String telefone,

        @Email(message = "Email inválido")
        @Size(max = 150)
        String email,

        @NotNull
        Boolean exigeNotaFiscal,

        @Valid
        @NotNull(message = "Endereço é obrigatório")
        CriarEnderecoRequest endereco
) {
}
