package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {

    public static void main(String[] args) {

        Entreprise MaBoiteInfo = new Entreprise("TeamZongo",new ArrayList<Employe>());
        Employe Kaaris = new Employe("5656k","Oku","Gnakouri","Pere du 93", LocalDate.of(1980,1,30), LocalDate.of(1980,1,30),150,5000,1);
        Employe Erwan = new Employe("g456","Erwan","Bert","Empereur de la filouterie", LocalDate.of(1998,11,23), LocalDate.of(2015,2,7),150,2000,2);
        Employe Lorenzo = new Employe("5641k","Lolo","Lorenzo","Empreur du sale", LocalDate.of(1990,4,23), LocalDate.of(1990,4,23),150,4000,1);

        MaBoiteInfo.AddEmploye(Kaaris);
        MaBoiteInfo.AddEmploye(Erwan);
        MaBoiteInfo.AddEmploye(Lorenzo);

        System.out.println(MaBoiteInfo);
    }
}