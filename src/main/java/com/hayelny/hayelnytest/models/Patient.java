package com.hayelny.hayelnytest.models;

import java.util.UUID;

public class Patient {
    private final UUID id;
    private final String name;
    private final String disease;
    private final String diagnosis;

    public Patient(String name, String disease, String diagnosis) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.disease = disease;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
