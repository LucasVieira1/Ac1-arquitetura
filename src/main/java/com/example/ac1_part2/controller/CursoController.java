package com.example.ac1_part2.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1_part2.model.Agenda;
import com.example.ac1_part2.model.Curso;
import com.example.ac1_part2.model.Professor;
import com.example.ac1_part2.repository.CursoRepository;
import com.example.ac1_part2.repository.ProfessorRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping
    public List<Curso> ListaCurso(){
       return cursoRepository.findAll();
    }

    @GetMapping("/{id}")
    public List<Curso> ListaCurso(@PathVariable Long id){
       return cursoRepository.findAllById(id);
    }
    
    @PostMapping
    public Curso criaCurso(@RequestBody Curso curso){
       return cursoRepository.save(curso);
    }

    @PutMapping("/alterar")
    public Curso alteraCurso(@RequestBody Curso curso){
       return cursoRepository.save(curso);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletaCurso(@PathVariable Long id){
        cursoRepository.deleteById(id);
    }

    @GetMapping("/professoresPorCurso")
    public List<Professor> ListarProfessor(@RequestBody Curso curso){
         return cursoRepository.findProfessores(curso);
    }

    @GetMapping("/cursoPorAgenda")
    public List<Agenda> ListarAgenda(@RequestBody Curso curso){
       return cursoRepository.findAgendas(curso);
    }

}
