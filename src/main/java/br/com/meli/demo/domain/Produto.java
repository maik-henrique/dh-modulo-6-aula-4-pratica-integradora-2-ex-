package br.com.meli.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.List;

@Document(indexName = "loja")
@Data
public class Produto {
    @Id
    private String id;
    private String nome;
    private String categoria;
    private BigDecimal precoVenda;
    private int quantideDisponivel;
    private String armazem;

}
