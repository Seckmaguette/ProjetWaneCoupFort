package services;

import dao.RvDao;
import models.Patient;
import models.RendezVous;

import java.util.List;

public class RvService {
    private RvDao rvDao;

    public RvService() {
    }

    public RvDao getRvDao() {
        return rvDao;
    }

    public void setRvDao(RvDao rvDao) {
        this.rvDao = rvDao;
    }

    public List<RendezVous> rendezVousList(){return rvDao.find();}



public List<RendezVous> rendezVousListPatie(Patient p){return rvDao.findByPatients(p);}


}
