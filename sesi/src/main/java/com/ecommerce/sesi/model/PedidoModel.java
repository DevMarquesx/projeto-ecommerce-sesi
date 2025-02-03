package com.ecommerce.sesi.model;

import com.ecommerce.sesi.dto.PagamentoDto;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "Pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Instant momento;
    private StatusDoPedido status;

    public PedidoModel(PedidoDto dto) {
        this.momento = dto.momento();
        this.status = dto.status();
    }
}
