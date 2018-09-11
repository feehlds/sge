package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.*;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepository {
	private static Collection<Turma> turmas = new ArrayList<Turma>();
	private static Collection<Curso> cursos = new ArrayList<Curso>();
	private static Collection<Aluno> alunos = new ArrayList<Aluno>();

	public CursosRepository(Collection<Turma> turmas)
	{
		this.turmas.addAll(turmas);
	}

	
	public Curso buscarPorCodigo(String codigo) {
		for(Curso curso : CursosRepository.cursos)
		{
			if(curso.getCodigoCurso().equals(codigo))
			{
				return curso;
			}
		}
		return null;
	}
	
	public Collection<Turma> buscarTurmas(String codigoCurso){
		return null;
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		return null;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		for(Aluno aluno : CursosRepository.alunos) {
			if(aluno.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}
	
	public void adicionarAluno(Aluno aluno) {
		CursosRepository.alunos.add(aluno);
	}

	public static Collection<Curso> getCurso() {
		return curso;
	}

	public static void setCurso(Collection<Curso> curso) {
		CursosRepository.curso = curso;
	}
}
