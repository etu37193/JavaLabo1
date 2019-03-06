package com.company;

import com.company.Editeur;
import com.company.Livre;

public class OuvrageScientifique extends Livre {
    private int nbPagesAnnexes;

    public OuvrageScientifique(String titre, int anneeEdition, Editeur editeur, int nbPagesTableMatiere, int nbPagesPreface, int nbPagesCorps, int nbPagesAnnexes) {
        super(titre, anneeEdition, editeur, nbPagesTableMatiere, nbPagesPreface, nbPagesCorps);
        this.nbPagesAnnexes = nbPagesAnnexes;
    }

    @Override
    public int totalPages(){
        return super.totalPages() + this.nbPagesAnnexes;
    }

    @Override
    public String categorie(){
        return "L'ouvrage scientifique";
    }
}
