package com.company;

public class Auteur {
    private static final int NB_OEUVRES_MAX = 10;
    private String prenom;
    private String nom;
    private Livre[] oeuvres;
    private int nbOeuvres;

    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.oeuvres = new Livre[NB_OEUVRES_MAX];
        this.nbOeuvres = 0;
    }

    public void ajouterLivre(Livre nouveauLivre){
        this.oeuvres[nbOeuvres] = nouveauLivre;
        nbOeuvres++;
    }

    public int totalPagesEcrites(){
        int totalPages = 0;
        for(int i = 0;i < nbOeuvres;i++){
            totalPages += this.oeuvres[i].totalPages();
        }

        return totalPages;
    }

    public String listingLivres(){
        String contenu = "";
        for (int i = 0;i<nbOeuvres;i++){
            contenu += this.oeuvres[i];
        }
        return contenu;
    }
}
