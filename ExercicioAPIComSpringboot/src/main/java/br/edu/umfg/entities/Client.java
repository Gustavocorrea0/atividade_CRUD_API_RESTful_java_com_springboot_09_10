package br.edu.umfg.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.UUID;

/**
 * @author Gustavo Alfredo
 */

public class Client {
    private UUID id;
    private String name;
    private String lastName;
    private String document;

    @JsonCreator
    public Client(String name, String lastName, String document) {
        this.id = UUID.randomUUID(); //Gera um id Random
        this.name = name;
        this.lastName = lastName;
        this.document = document;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
