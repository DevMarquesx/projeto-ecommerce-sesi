package com.ecommerce.sesi.dto;

import com.ecommerce.sesi.model.StatusDoPedido;

import java.time.Instant;

public record PedidoDto(Instant momento, StatusDoPedido status) {
}
