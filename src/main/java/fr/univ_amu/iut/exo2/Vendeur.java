package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Vendeur extends Commerciaux
{

    public Vendeur(String numSecu, String nomEmp, String prenomEmp, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeurres, double base, int numEmp, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nomEmp, prenomEmp, echelon, dateNaissance, dateEmbauche, nbHeurres, base, numEmp, chiffreAffaires, tauxCommission);
    }

    public double getSalaireBrutRep()
    {
        return super.getSalaireBrut();
    }
}
