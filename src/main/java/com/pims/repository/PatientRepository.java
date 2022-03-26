package com.pims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pims.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
