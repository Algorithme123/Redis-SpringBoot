package com.gkd.redis_spring.repository;

import com.gkd.redis_spring.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}