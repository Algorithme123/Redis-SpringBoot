package com.gkd.redis_spring.services;


import com.gkd.redis_spring.models.Produit;
import com.gkd.redis_spring.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProduitService {

    private final ProduitRepository produitRepository;

    @Cacheable(value = "produits")
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @CachePut(value = "produits", key = "#produit.id")
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @CacheEvict(value = "produits", key = "#id")
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

}
