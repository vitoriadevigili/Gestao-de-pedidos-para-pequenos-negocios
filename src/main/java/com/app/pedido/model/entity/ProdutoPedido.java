package com.app.pedido.model.entity;

import com.app.cliente.model.entity.Cliente;
import com.app.produto.model.entity.Produto;
import com.app.usuario.model.entity.Usuario;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "produto_pedido")
public class ProdutoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(
            name = "valor_unitario",
            nullable = false,
            precision = 10,
            scale = 2
    )
    private BigDecimal valorUnitario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "pedido_id",
            nullable = false
    )
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "produto_id",
            nullable = false
    )
    private Produto produto;

    public ProdutoPedido() {
    }
}
