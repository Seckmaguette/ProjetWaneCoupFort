package dao;

import models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RvDao {
    private List<RendezVous> rendezVousList = new ArrayList<>();
    private List<Personne> personnes = new ArrayList<>();

    public RvDao() {
        personnes.add(new Medecin("001", "Lior Chamla", Specialite.CARDIOLOGUE ));
        personnes.add(new Medecin("002", "Mathieu Nebra", Specialite.GENERALISTE ));
        personnes.add(new Medecin("003", "Babacar Niang", Specialite.PEDIATRE ));
        personnes.add(new Patient("004","Barro b+",Antecedent.DIABETE));

        rendezVousList.add(new RendezVous("10:20","12:30",(Patient) personnes.get(3),Specialite.CARDIOLOGUE));
        rendezVousList.add(new RendezVous("10:20","12:30",(Patient) personnes.get(3), (Medecin)personnes.get(1),Specialite.GENERALISTE));

    }



    public List<RendezVous> find(){
        return rendezVousList;
    }

    public List<RendezVous> findByPatients(Patient p){

    return rendezVousList.stream().filter(pers -> pers.getPatient().getId() == p.getId()).collect(Collectors.toList());
    }

    public void AddRV(RendezVous rv){
         rendezVousList.add(rv);
    }
  
}


