package com.company;

import com.company.Editeur;

public class Livre extends Ouvrage implements Publication {
    private int nbPagesTableMatiere;
    private int nbPagesPreface;
    private int nbPagesCorps;

    public Livre(String titre, int anneeEdition, Editeur editeur, int nbPagesTableMatiere, int nbPagesPreface, int nbPagesCorps) {
        super(titre, anneeEdition, editeur);
        this.nbPagesTableMatiere = nbPagesTableMatiere;
        this.nbPagesPreface = nbPagesPreface;
        this.nbPagesCorps = nbPagesCorps;
    }

    @Override
    public int totalPages() {
        return this.nbPagesCorps + this.nbPagesPreface + this.nbPagesTableMatiere;
    }

    @Override
    public String categorie(){
        return "Le livre";
    }

    @Override
    public String toString() {
        return super.toString() + " compte " + totalPages() + " pages et est intitulé " + this.getTitre();
    }

    public void setNbPagesPreface(int nbPagesPreface) {
        this.nbPagesPreface = nbPagesPreface;
    }
}
