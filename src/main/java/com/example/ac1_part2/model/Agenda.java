package com.example.ac1_part2.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private LocalDateTime horarioInicio;
    @Column(length = 200, nullable = false)
    private LocalDateTime horarioFim;
    @Column(length = 200, nullable = false)
    private LocalDateTime dataInicio;
    @Column(length = 200, nullable = false)
    private LocalDateTime dataFim;
    
    @Column(length = 200, nullable = false)
    private String cidade;

    @Column(length = 200, nullable = false)
    private String estado;

    @Column(length = 200, nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    
}
