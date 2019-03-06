package com.company;

public class Editeur {
    private String nom;
    private Localite localite;

    public Editeur(String nom, Localite localite) {
        this.nom = nom;
        this.localite = localite;
    }

    @Override
    public String toString() {
        return "Les éditions " + this.nom;
    }
}
