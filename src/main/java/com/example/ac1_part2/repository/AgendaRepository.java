package com.example.ac1_part2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1_part2.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}
