package fr.univ_amu.iut.exo1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employe {

    public int NumEmp;
    public String NumSecu;
    public String NomEmp;
    public String PrenomEmp;
    public String Echelon;
    public LocalDate DateNaissance;
    public LocalDate DateEmbauche;


    public double NbHeurres;
    public double Base;

    public Employe(String numSecu, String nomEmp, String prenomEmp, String echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double nbHeurres, double base, int numEmp) {
        NumSecu = numSecu;
        NomEmp = nomEmp;
        PrenomEmp = prenomEmp;
        Echelon = echelon;
        DateNaissance = dateNaissance;
        DateEmbauche = dateEmbauche;
        NbHeurres = nbHeurres;
        Base = base;
        NumEmp = numEmp;
    }



    public int getNumEmp() {
        return NumEmp;
    }

    public String getNumSecu() {
        return NumSecu;
    }

    public String getNomEmp() {
        return NomEmp;
    }

    public String getPrenomEmp() {
        return PrenomEmp;
    }

    public String getEchelon() {
        return Echelon;
    }

    public LocalDate getDateNaissance() {
        return DateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return DateEmbauche;
    }

    public double getNbHeurres() {
        return NbHeurres;
    }

    public double getBase() {
        return Base;
    }

    public double getSalaireBrut()
    {
        return this.getBase() * this.getNbHeurres();
    }

    public double getSalaireNet()
    {
        return this.getSalaireBrut() * 0.8;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String Date_Naissance = DateNaissance.format(formatter);
        String Date_Embauche = DateEmbauche.format(formatter);

        return "Employe :" +
                NomEmp +
                PrenomEmp + '\n' +
                "Numéro d'employé : " + NumEmp + '\n' +
                "Numéro de sécurité sociale : " + NumSecu + '\n' +
                "Echelon : " + Echelon + '\n' +
                "Date de naissance : " + Date_Naissance + '\n' +
                "Date d'embauche : " + Date_Embauche + '\n' +
                "Salaire Brut : " + getSalaireBrut() + '\n' +
                "Salaire Net : " + getSalaireNet() + '\n';
    }
}
