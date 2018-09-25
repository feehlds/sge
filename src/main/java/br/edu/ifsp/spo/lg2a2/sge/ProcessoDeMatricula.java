package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;
import java.util.Random;

public class ProcessoDeMatricula {
	private CursosRepository CursosRepository;
	private AlunosRepository AlunosRepository;
	SituacaoMatricula resultado = null;
	private Curso curso;
	
	public ProcessoDeMatricula(Curso curso) {
		this.curso = curso;
		CursosRepository = new CursosRepository();
		AlunosRepository = new AlunosRepository();
	}

	public SituacaoMatricula verificarExistenciaAluno(String cpf) {
		for(Aluno aluno : CursosRepository.alunos) {
			if(aluno.getCpf().equals(cpf)) {
				resultado = SituacaoMatricula.CadastradoNoCurso;
			}else {
				resultado = SituacaoMatricula.Novo;
			}
		}
		return resultado;
	}
	
	public ComprovanteMatricula processarMatricula(DadosAluno dados) {
		return null;
	}
	
	private String gerarProntuario() {
		int prontn = new Random().nextInt(100000);
		String prontuario = "SP" + prontn;
		return prontuario;
	}
	
}
	