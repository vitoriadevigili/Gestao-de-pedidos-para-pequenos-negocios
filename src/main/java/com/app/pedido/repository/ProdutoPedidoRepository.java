package com.app.pedido.repository;

import com.app.pedido.model.entity.ProdutoPedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoPedidoRepository extends JpaRepository<ProdutoPedido, Integer> {

    List<ProdutoPedido> findAllByPedidoId(Integer pedidoId);

    void deleteAllByPedidoId(Integer pedidoId);
}
