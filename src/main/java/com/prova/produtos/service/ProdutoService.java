package com.prova.produtos.service;

import com.prova.produtos.entity.ProdutoModel;
import com.prova.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel criar(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produtoAtualizado) {
        produtoAtualizado.setId(id);
        return produtoRepository.save(produtoAtualizado);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
