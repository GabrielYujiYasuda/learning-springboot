package com.example.SpringProject.model.entities.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.SpringProject.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContaining(String palavraNome);
}
