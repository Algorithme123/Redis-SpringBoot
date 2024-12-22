package com.gkd.redis_spring.repository;

import com.gkd.redis_spring.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}