package com.example.ac1_part2.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String descricao;

    @Column(length = 200, nullable = false)
    private Integer cargaHoraria;

    @Column(length = 200, nullable = false)
    private String objetivos;

    @Column(length = 200, nullable = false)
    private String ementa;

    @OneToMany(mappedBy = "curso")
    List<Agenda> agendas;

    @JoinTable(name = "especializacao", joinColumns = {@JoinColumn (name = "curso_id")},
     inverseJoinColumns = {@JoinColumn(name = "professor_id")})

     @ManyToMany
     List<Professor> professores;

}
