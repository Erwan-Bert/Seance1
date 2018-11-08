package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Representant extends Commerciaux
{
    public Representant(String numSecu, String nomEmp, String prenomEmp, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeurres, double base, int numEmp, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nomEmp, prenomEmp, echelon, dateNaissance, dateEmbauche, nbHeurres, base, numEmp, chiffreAffaires, tauxCommission);
    }

    public double getSalaireBrutRep()
    {
        Employes_Ordninaires employes_ordninaires =new Employes_Ordninaires(getNumSecu(),getNomEmp(),getPrenomEmp(),getEchelon(),getDateNaissance(),getDateEmbauche(),getNbHeurres(),getBase(),getNumEmp());
        return employes_ordninaires.getSalaireBrut();
    }
}
