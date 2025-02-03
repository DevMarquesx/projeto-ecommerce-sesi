package com.ecommerce.sesi.model;

import com.ecommerce.sesi.dto.ItemDoPedidoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDoPedidoModel {

    private Integer quantidade;
    private double preco;

    public ItemDoPedidoModel(ItemDoPedidoDto dto) {
        this.quantidade = dto.quantidade();
        this.preco = dto.preco();
    }
}
