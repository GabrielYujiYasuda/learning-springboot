package com.example.SpringProject.controllers;

import com.example.SpringProject.model.entities.Produto;
import com.example.SpringProject.model.entities.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    //@PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);

    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
// }

    @DeleteMapping(path = "{id}")
    public void deletarProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

    @GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutoPaginado(@PathVariable int numeroPagina) {
        PageRequest page = PageRequest.of(numeroPagina, 2);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path = "/nome/{palavraNome}")
    public Iterable<Produto> obterProdutoNome(@PathVariable String palavraNome) {
        return produtoRepository.findByNomeContaining(palavraNome);
    }
}
