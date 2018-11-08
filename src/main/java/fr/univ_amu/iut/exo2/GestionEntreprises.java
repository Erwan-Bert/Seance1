package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {

        Entreprise MaBoiteInfo = new Entreprise("TeamZongo",new ArrayList<Employe>());
        Employe Kaaris = new Vendeur("5656k","Oku","Gnakouri",93, LocalDate.of(1980,1,30), LocalDate.of(1980,1,30),150,5000,1,50,250);
        Employe Erwan = new Techniciens("g456","Erwan","Bert",31, LocalDate.of(1998,11,23), LocalDate.of(2015,2,7),150,2000,2,650,15);
        Employe Lorenzo = new Representant("5641k","Lolo","Lorenzo",27, LocalDate.of(1990,4,23), LocalDate.of(1990,4,23),150,4000,1,500,180);

        MaBoiteInfo.AddEmploye(Kaaris);
        MaBoiteInfo.AddEmploye(Erwan);
        MaBoiteInfo.AddEmploye(Lorenzo);

        System.out.println(MaBoiteInfo);
    }
}