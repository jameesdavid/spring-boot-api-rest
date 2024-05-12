package com.jamees.apirestful.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idturma")
    private int id;

    @Column(name = "horario")
    @Temporal(TemporalType.TIME)
    private Date horario;

    @Column(name = "duracao", nullable = false)
    private int duracao;

    @Column(name = "dataInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column(name = "dataFim", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    @ManyToOne
    @JoinColumn(name = "idinstrutor", nullable = false)
    private Instrutor instrutor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

    
}
