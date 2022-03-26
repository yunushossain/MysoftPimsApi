package com.pims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pims.model.Information;

public interface InformationRepository extends JpaRepository<Information, Integer> {

}
