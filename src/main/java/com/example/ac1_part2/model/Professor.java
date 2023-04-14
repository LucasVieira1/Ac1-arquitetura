package com.example.ac1_part2.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(length = 200, nullable = false)
    private String nome;

    
    @Column(length = 200, nullable = false)
    private String cpf;

    
    @Column(length = 200, nullable = false)
    private String rg;

    
    @Column(length = 200, nullable = false)
    private String endereco;

    
    @Column(length = 200, nullable = false)
    private String celular;
    
    @OneToMany(mappedBy = "professor")
    List<Agenda> agendas;

    @ManyToMany(mappedBy = "professores")
    List<Curso> cursos;


}
