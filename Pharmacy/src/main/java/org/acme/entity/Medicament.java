package org.acme.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
public class Medicament {

    @Id @GeneratedValue
    public Long universal_code;
    public String name;
    public String manufacturer;
    public String common_names;
    public String brand;
    public String commercial_name;
    public String pharmaceutical_form;
    public String dci;
    public String category;
    public String active_components;
    public String uses;
    public String how_to_use;
    public String effect;
    public String presentation;
    public String overdose;
    public String side_effects;
    public String precautions;
    public String drug_interactions;
    public String notes;
    public Float dose;
    public Integer amount;

}