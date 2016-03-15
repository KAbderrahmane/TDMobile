package com.example.abderrahmene.myapplication;

import java.io.Serializable;

/**
 * Created by Abderrahmene on 03/03/2016.
 */
public class Book implements Serializable {
    private  String  titre;
    private  String auteur;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;

    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
