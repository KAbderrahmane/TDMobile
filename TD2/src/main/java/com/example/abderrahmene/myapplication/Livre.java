package com.example.abderrahmene.myapplication;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Abderrahmene on 03/03/2016.
 */
public class Livre implements Serializable {


    private  String titre;
    private  List<String> auteurs;
    private  String resume;
    private  int annee;
    private  String Edition;
    private int cover;
    private  int cover_icon;
    public Livre()
    {
        
    }
    public Livre(String titre, List<String> auteurs, String resume, int annee, String edition, int cover, int cover_icon) {
        this.titre = titre;
        this.auteurs = auteurs;
        this.resume = resume;
        this.annee = annee;
        Edition = edition;
        this.cover = cover;
        this.cover_icon = cover_icon;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getCover_icon() {
        return cover_icon;
    }

    public void setCover_icon(int cover_icon) {
        this.cover_icon = cover_icon;
    }



    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<String> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<String> auteurs) {
        this.auteurs = auteurs;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }
}
