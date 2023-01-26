package models;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Personne{
  
    private Antecedent antecedent;
    private List<RendezVous> rendezVousList = new ArrayList<>();

    public Patient(String numero, String nomComplet, Antecedent antecedent) {
        super(numero, nomComplet);
        this.antecedent = antecedent;
        this.typePersonne = TypePersonne.PATIENT;
    }
    public Patient(String numero, String nomComplet) {
        super(numero, nomComplet);
        this.typePersonne = TypePersonne.PATIENT;
    }
  
    public Antecedent getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(Antecedent antecedent) {
        this.antecedent = antecedent;
    }

    @Override
    public String toString() {
        return super.toString()+" Patient{" +
                "antecedent=" + antecedent +
                '}';
    }
}
