package com.example.ac1_part2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1_part2.model.Agenda;
import com.example.ac1_part2.model.Curso;
import com.example.ac1_part2.model.Professor;

public interface CursoRepository extends JpaRepository<Curso, Long>{

    List<Curso> findAllById(Long id);

    List<Professor> findProfessores(Curso curso);

    List<Agenda> findAgendas(Curso curso);

}
