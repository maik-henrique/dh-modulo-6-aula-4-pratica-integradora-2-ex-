package br.com.meli.demo.service;

import br.com.meli.demo.domain.Produto;
import br.com.meli.demo.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Iterable<Produto> findAll() {
        return produtoRepository.findAll();
    }
}
