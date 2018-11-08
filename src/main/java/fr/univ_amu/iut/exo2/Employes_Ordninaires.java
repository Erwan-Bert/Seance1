package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Employes_Ordninaires extends Employe
{

    public Employes_Ordninaires(String numSecu, String nomEmp, String prenomEmp, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeurres, double base, int numEmp) {
        super(numSecu, nomEmp, prenomEmp, echelon, dateNaissance, dateEmbauche, nbHeurres, base, numEmp);
    }

    public void effectuerTacheOrdinaire()
    {
        System.out.println("J'effectue une tache ordinaire");
    }

    public double getSalaireBrut()
    {
        return super.getSalaireBrut() + this.getEchelon() *100;
    }
}
