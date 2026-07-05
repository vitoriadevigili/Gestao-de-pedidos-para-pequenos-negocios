package com.app.pedido.repository;

import com.app.pedido.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findAllByUsuarioIdAndAtivoTrue(Integer usuarioId);

    Optional<Pedido> findByUsuarioIdAndId(Integer usuarioId, Integer id);
}
