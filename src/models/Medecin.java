package models;

import java.util.ArrayList;
import java.util.List;

public class Medecin extends Personne{

    private Specialite specialite;
    private List<RendezVous> rendezVousList = new ArrayList<>();

    public Medecin(String numero, String nomComplet, Specialite specialite) {
        super(numero, nomComplet);
        this.specialite = specialite;
        this.typePersonne = TypePersonne.PATIENT;
    }

    public List<RendezVous> getRendezVousList() {
        return rendezVousList;
    }

    public void setRendezVousList(List<RendezVous> rendezVousList) {
        this.rendezVousList = rendezVousList;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString()+" Medecin{" +
                "specialite=" + specialite +
                '}';
    }
}
