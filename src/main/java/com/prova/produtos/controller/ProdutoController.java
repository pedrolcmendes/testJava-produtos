package com.prova.produtos.controller;

import com.prova.produtos.entity.ProdutoModel;
import com.prova.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ProdutoModel save(@RequestBody ProdutoModel produtoModel) {
        return produtoService.criar(produtoModel);
    }


    @GetMapping
    public List<ProdutoModel> buscarTodos() {
        return produtoService.buscarTodos();
    }

    @GetMapping ("/{id}")
    public Optional<ProdutoModel> buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }

    @PutMapping ("/{id}")
    public ProdutoModel atualizar(@PathVariable Long id, @RequestBody ProdutoModel produtoAtualizado) {
        return produtoService.atualizar(id, produtoAtualizado);
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }

}
