package org.acme.service;

import org.acme.entity.Medicament;
import org.acme.repository.MedicamentRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MedicamentService {

    @Inject
    MedicamentRepository medicamentRepository;

    public List<Medicament> findALlMedicaments(){
        return medicamentRepository.findAll().list();
    }
    @Transactional
    public void addMedicament(Medicament medicament){
        medicamentRepository.persist(medicament);
    }
}
