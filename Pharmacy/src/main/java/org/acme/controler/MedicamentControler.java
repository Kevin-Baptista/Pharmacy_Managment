package org.acme.controler;

import org.acme.entity.Medicament;
import org.acme.service.MedicamentService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/medicament")
public class MedicamentControler {
    @Inject
    MedicamentService medicamentService;

    @GET
    public List<Medicament> retrieveMedicament() {

        List<Medicament> medicaments = new ArrayList<>();
        try {
            medicaments = medicamentService.findALlMedicaments();
        }catch (Exception e){
            e.printStackTrace();
        }

        return medicaments;
    }
    @POST
    public void addMedicament(Medicament medicament){medicamentService.addMedicament(medicament);}
}



