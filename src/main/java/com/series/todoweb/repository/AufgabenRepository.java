package com.series.todoweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.series.todoweb.models.Aufgabe;

public interface AufgabenRepository extends JpaRepository<Aufgabe, Long> {

}
