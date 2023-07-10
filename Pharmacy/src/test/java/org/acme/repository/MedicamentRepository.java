package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.entity.Medicament;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MedicamentRepository implements PanacheRepository<Medicament> {

}
