package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OuvrageScientifique ouvrage = new OuvrageScientifique("salut",1997, new Editeur("Moule", new Localite("Andenne",30000)),10,20,50,2 );
        Auteur auteur = new Auteur("Quentin", "Mosselman");

        auteur.ajouterLivre(ouvrage);
        ouvrage.setNbPagesPreface(10);
        System.out.println(auteur.listingLivres());
    }
}
