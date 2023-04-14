package com.example.ac1_part2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1_part2.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

    List<Professor> findAllById(Long id);

    List<Professor> findAll();

}
