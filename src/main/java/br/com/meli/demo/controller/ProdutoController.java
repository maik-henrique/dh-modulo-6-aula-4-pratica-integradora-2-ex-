package br.com.meli.demo.controller;

import br.com.meli.demo.domain.Produto;
import br.com.meli.demo.dto.ProdutoRequest;
import br.com.meli.demo.service.ProdutoService;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<?> storeArticle(@RequestBody ProdutoRequest produtoRequest) {
        Produto mappedArticle = modelMapper.map(produtoRequest, Produto.class);
        return ResponseEntity.ok(produtoService.save(mappedArticle));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(produtoService.findAll());
    }
}
