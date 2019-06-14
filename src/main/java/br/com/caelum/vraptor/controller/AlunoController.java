package br.com.caelum.vraptor.controller;

import java.util.ArrayList;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Aluno;
import br.com.caelum.vraptor.view.Results;

@Controller
public class AlunoController {

	@Inject Result result;
	
	@Get("/alunos")
	public void buscaAlunos() {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add( new Aluno("Snow Jow", "524125632") );
		alunos.add( new Aluno("Joao das Neves", "8541256325") );
		
		result.use(Results.json()).from(alunos).serialize();
	}
	
	@Post("/alunos")
	@Consumes("application/json")
	public void adicionaAluno(Aluno aluno) {
		
		//sALVAR NO BANCO
		
		aluno.setId(1);
		result.use(Results.json()).withoutRoot().from(aluno).serialize();
	}
	
}
