package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Commerciaux extends Employe
{
    public double chiffreAffaires;
    public double tauxCommission;

    public Commerciaux(){}

    public Commerciaux(String numSecu, String nomEmp, String prenomEmp, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeurres, double base, int numEmp, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nomEmp, prenomEmp, echelon, dateNaissance, dateEmbauche, nbHeurres, base, numEmp);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    public void negocierTransaction(){
        System.out.println("Je négocie une transaction");
    }

    public double GetSalaireBrut()
    {
        return (super.getSalaireBrut()/this.getNbHeurres()) + this.getChiffreAffaires()*this.getTauxCommission();
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }
}
