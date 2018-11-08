package fr.univ_amu.iut.exo1;

import java.util.ArrayList;

public class Entreprise {

    public String NomEnt;
    private ArrayList<Employe> ListeEmploye = new ArrayList<Employe>();

    public Entreprise(String nomEnt, ArrayList<Employe> listeEmploye) {
        NomEnt = nomEnt;
        ListeEmploye = listeEmploye;
    }

    public String getNomEnt() {
        return NomEnt;
    }



    public ArrayList<Employe> getListeEmploye() {
        return ListeEmploye;
    }

    public void setNomEnt(String nomEnt) {
        NomEnt = nomEnt;
    }

    public void setListeEmploye(ArrayList<Employe> listeEmploye) {
        ListeEmploye = listeEmploye;
    }

    public void AddEmploye(Employe employe)
    {
        ListeEmploye.add(employe);
    }

    public void RemoveEmploye(Object obj)
    {
        ListeEmploye.remove(obj);
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "NomEnt='" + NomEnt + '\'' +
                ", ListeEmploye=" + ListeEmploye +
                '}';
    }
}
