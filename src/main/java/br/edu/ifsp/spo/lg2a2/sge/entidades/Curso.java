package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	private Collection<Turma> turmas;
	private String codigoCurso;
	
	private Collection<Turma> turmas;
	public Collection<Turma> getTurmas() {
		this.turmas = turmas;
		return this.turmas;
	}

}
