package com.ecommerce.sesi.model;

import com.ecommerce.sesi.dto.PagamentoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "Pagamento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Instant momento;

    public PagamentoModel(PagamentoDto dto) {
        this.momento = dto.momento();
    }
}
