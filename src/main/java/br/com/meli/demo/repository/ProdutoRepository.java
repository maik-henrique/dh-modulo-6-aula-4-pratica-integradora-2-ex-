package br.com.meli.demo.repository;

import br.com.meli.demo.domain.Produto;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends ElasticsearchRepository<Produto, String> {
}
