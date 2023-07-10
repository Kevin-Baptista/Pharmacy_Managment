package org.acme.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
public class Medicament {

    @Id
    private Long universal_code;
    private String name;
    private String manufacturer;
    private String common_names;
    private String brand;
    private String commercial_name;
    private String pharmaceutical_form;
    private String dci;
    private String category;
    private String active_components;
    private String uses;
    private String how_to_use;
    private String effect;
    private String presentation;
    private String overdose;
    private String side_effects;
    private String precautions;
    private String drug_interactions;
    private String notes;
    private Float dose;
    private Integer amount;

}