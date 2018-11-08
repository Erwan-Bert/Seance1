package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Techniciens extends Employe
{
    public double nbUnitesProduites;
    public double tauxCommissionUnite;

    public Techniciens(String numSecu, String nomEmp, String prenomEmp, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeurres, double base, int numEmp, double nbUnitesProduites, double tauxCommissionUnite) {
        super(numSecu, nomEmp, prenomEmp, echelon, dateNaissance, dateEmbauche, nbHeurres, base, numEmp);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public void fabriquerProduit()
    {
        System.out.println("Je fabrique un produit");
    }

    public double getSalaireBrut()
    {
        return super.getSalaireBrut() + this.getNbUnitesProduites() * this.getTauxCommissionUnite();
    }

    public double getNbUnitesProduites() {
        return nbUnitesProduites;
    }

    public double getTauxCommissionUnite() {
        return tauxCommissionUnite;
    }
}
