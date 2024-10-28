package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateDeCreation;

    public Compte(int code, double solde, Date dateDeCreation) {
        this.code = code;
        this.solde = solde;
        this.dateDeCreation = dateDeCreation;
    }


    public Compte() {
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }
}
