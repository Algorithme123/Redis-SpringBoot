package com.gkd.redis_spring.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private double prix;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}
