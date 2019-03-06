package com.company;

import com.company.Editeur;

public class Ouvrage {
    private String titre;
    private int anneeEdition;
    private Editeur editeur;

    public Ouvrage(String titre, int anneeEdition, Editeur editeur) {
        this.titre = titre;
        this.anneeEdition = anneeEdition;
        this.editeur = editeur;
    }

    public String categorie(){
        return "L'ouvrage";
    }

    @Override
    public String toString() {
        return this.categorie() + " édité en " +  this.anneeEdition + " par " + this.editeur;
    }

    public String getTitre() {
        return titre;
    }
}
