package br.com.meli.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequest {
    private String nome;
    private String categoria;
    private BigDecimal precoVenda;
    private int quantideDisponivel;
    private String armazem;

}
