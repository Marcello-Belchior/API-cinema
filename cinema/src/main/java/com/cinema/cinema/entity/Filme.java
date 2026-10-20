
package com.cinema.cinema.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFilme;

    @NotBlank
    @Column(unique = true, length = 40)
    private String tituloFilme;

    @NotBlank
    @Column(length = 30)
    private String diretorFilme;

    @NotBlank
    @Column(length = 30)
    private String generoFilme;

    @NotNull
    @Column
    private Integer tempoFilme;
}
