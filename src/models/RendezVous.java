package models;

import java.security.SecurityPermission;
import java.time.LocalDate;


public class RendezVous {
    private int id;
    private LocalDate localDate;
    private String heureDebut;
    private String heureFin;
    private Statut statut;
    private Patient patient;
    private Medecin medecin;
    private Specialite specialite;
    private static int nbr;

    public RendezVous() {
        this.id = ++nbr;
    }

    public RendezVous(String heureDebut, String heureFin, Patient patient, Medecin medecin , Specialite specialite) {
        this.localDate = LocalDate.now();
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.statut = Statut.VALIDE;
        this.patient = patient;
        this.medecin = medecin;
        this.specialite = specialite;
        this.id = ++nbr;
    }
    public RendezVous(String heureDebut, String heureFin, Patient patient, Specialite specialite) {
        this.localDate = LocalDate.now();
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.statut = Statut.NONVALIDE;
        this.patient = patient;
        this.specialite = specialite;
        this.id = ++nbr;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", heureDebut='" + heureDebut + '\'' +
                ", heureFin='" + heureFin + '\'' +
                ", statut=" + statut +
                ", patient=" + patient +
                ", medecin=" + medecin +
                ", specialite=" + specialite +
                '}';
    }
}
