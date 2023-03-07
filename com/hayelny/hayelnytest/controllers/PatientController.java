package com.hayelny.hayelnytest.controllers;

import com.hayelny.hayelnytest.models.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @GetMapping("/patients")
    public ResponseEntity<Map<String,List<Patient>>> viewPatients(){
        Patient p1 = new Patient("Jan","coolness","chronic");
        Patient p2 = new Patient("Besho","7anyaka","king el AI");
        Patient p3 = new Patient("Ayoub","3ezbawy","FAANG sexual");
        Patient p4 = new Patient("Gad","depression","تعبان عبد الرحيم");

        List<Patient> patients = List.of(p1, p2, p3, p4);
        return new ResponseEntity<>(Map.of("patients",patients), HttpStatus.OK);
    }
}
