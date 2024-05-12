package com.jamees.apirestful.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinstrutor")
    private int id;

    @Column(name = "RG", nullable = false)
    private int rg;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "nascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date nascimento;

    @Column(name = "titulacao", nullable = false)
    private int titulacao;

    @OneToMany(mappedBy = "instrutor")
    private List<Turma> turmas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public int getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(int titulacao) {
		this.titulacao = titulacao;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
    
    
}
