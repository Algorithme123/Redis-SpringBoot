package com.gkd.redis_spring.services;

import com.gkd.redis_spring.models.Categorie;
import com.gkd.redis_spring.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;

    @Cacheable(value = "categories")
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @CachePut(value = "categories", key = "#categorie.id")
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @CacheEvict(value = "categories", allEntries = true)
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
